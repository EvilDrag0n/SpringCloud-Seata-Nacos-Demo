package info.lxlong.learn.seata.service.impl;

import info.lxlong.learn.seata.exception.MyException;
import info.lxlong.learn.seata.feignapi.OrderFeignApi;
import info.lxlong.learn.seata.feignapi.UserFeignApi;
import info.lxlong.learn.seata.params.CreateOrderParams;
import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.params.SaveOrderParams;
import info.lxlong.learn.seata.service.IMallService;
import info.lxlong.learn.seata.vo.CreateOrderVo;
import info.lxlong.learn.seata.vo.UserInfoVo;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 商城业务实现类
 *
 * @author lxlong
 * @date 2022/11/14 16:05
 */
@Service
@Slf4j
public class MallServiceImpl implements IMallService {

    @Resource
    private OrderFeignApi orderFeignApi;

    @Resource
    private UserFeignApi userFeignApi;

    @Override
    @GlobalTransactional
    public CreateOrderVo create(CreateOrderParams params) {

        //创建订单，扣取库存
        SaveOrderParams saveOrderParams = SaveOrderParams.builder()
                .productId(params.getProductId())
                .userId(params.getUserId())
                .productNum(params.getProductNum())
                .build();
        ResponseEntity<Long> createOrderResponse = orderFeignApi.saveOrder(saveOrderParams);
        if(createOrderResponse == null || !HttpStatus.OK.equals(createOrderResponse.getStatusCode())) {
            throw new MyException("远程调用订单服务失败");
        }

        Long orderId = createOrderResponse.getBody();

        //用户扣款
        EditAmountParams editAmountParams = new EditAmountParams(params.getUserId(), new BigDecimal(params.getProductNum() * 10));
        ResponseEntity<Boolean> descAmountResponse = userFeignApi.descAmount(editAmountParams);
        if(descAmountResponse == null || !HttpStatus.OK.equals(descAmountResponse.getStatusCode())) {
            throw new MyException("远程调用用户服务失败");
        }

        if(!descAmountResponse.getBody()) {
            throw new MyException("用户扣款失败");
        }

        //获取用户余额
        ResponseEntity<UserInfoVo> userInfoResponse = userFeignApi.info(params.getUserId());
        return CreateOrderVo.builder().orderId(orderId).userId(params.getUserId()).balance(userInfoResponse.getBody().getMoney()).build();
    }
}
