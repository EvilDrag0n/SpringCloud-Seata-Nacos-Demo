package info.lxlong.learn.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import info.lxlong.learn.seata.entity.Order;
import info.lxlong.learn.seata.exception.MyException;
import info.lxlong.learn.seata.feignapi.StockFeignApi;
import info.lxlong.learn.seata.mapper.OrderMapper;
import info.lxlong.learn.seata.params.SaveOrderParams;
import info.lxlong.learn.seata.params.StockEditParams;
import info.lxlong.learn.seata.service.IOrderService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description 订单实现类
 * @author lxlong
 * @create 2022/11/11 14:27
 */
@Service
@Slf4j
public class OrderService extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Autowired
    private StockFeignApi stockFeignApi;

    /**
     * 新增订单
     *
     * @param params 入参
     * @return 订单id
     */
    @Override
    @Transactional
    public Long insert(SaveOrderParams params) {
        log.info("====> orderService xid == {}", RootContext.getXID());

        Order order = Order.builder()
                .userId(params.getUserId())
                .productId(params.getProductId())
                .productNum(params.getProductNum())
                .build();
        baseMapper.insert(order);

        StockEditParams stockEditParams = new StockEditParams();
        stockEditParams.setProductId(params.getProductId());
        stockEditParams.setNum(params.getProductNum());
        ResponseEntity<Integer> descStockResult = stockFeignApi.desc(stockEditParams);
        if (descStockResult == null || descStockResult.getBody() == 0) {
            throw new MyException("扣取库存失败");
        }

        return order.getId();
    }
}
