package info.lxlong.learn.seata.feignapi;

import info.lxlong.learn.seata.params.SaveOrderParams;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 楼上科技01
 */
@FeignClient(name = "order-service", path = "/order")
public interface OrderFeignApi {

    /**
     * 保存订单
     * @param params 入参
     * @return  返回值
     */
    @PostMapping("/save")
    ResponseEntity<Long> saveOrder(@RequestBody @Validated SaveOrderParams params);
}
