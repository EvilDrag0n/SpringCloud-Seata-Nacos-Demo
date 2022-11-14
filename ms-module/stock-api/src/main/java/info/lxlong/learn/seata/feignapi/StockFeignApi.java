package info.lxlong.learn.seata.feignapi;

import info.lxlong.learn.seata.params.StockEditParams;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignApi {

    /**
     * 减少库存
     *
     * @param params 参数
     * @return 返回值
     */
    @PostMapping("/desc")
    ResponseEntity<Integer> desc(@RequestBody StockEditParams params);
}
