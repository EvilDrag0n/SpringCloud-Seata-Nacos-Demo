package info.lxlong.learn.seata.controller;

import info.lxlong.learn.seata.feignapi.OrderFeignApi;
import info.lxlong.learn.seata.params.SaveOrderParams;
import info.lxlong.learn.seata.service.IOrderService;
import io.seata.spring.boot.autoconfigure.properties.client.RmProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 订单接口
 * @author lxlong
 * @create 2022/11/11 14:32
 */
@RestController
@RequestMapping("/order")
public class OrderController implements OrderFeignApi {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private RmProperties rmProperties;

    /**
     * 保存订单
     *
     * @param params 入参
     * @return 返回值
     */
    @Override
    public ResponseEntity<Long> saveOrder(SaveOrderParams params) {
        return ResponseEntity.ok(orderService.insert(params));
    }

    @GetMapping
    public RmProperties get() {
        return this.rmProperties;
    }
}
