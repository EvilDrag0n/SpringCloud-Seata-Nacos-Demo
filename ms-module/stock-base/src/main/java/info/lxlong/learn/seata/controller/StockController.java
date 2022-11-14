package info.lxlong.learn.seata.controller;

import info.lxlong.learn.seata.entity.Stock;
import info.lxlong.learn.seata.feignapi.StockFeignApi;
import info.lxlong.learn.seata.params.StockEditParams;
import info.lxlong.learn.seata.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 库存控制器
 * @author lxlong
 * @create 2022/11/11 15:03
 */
@RestController
@RequestMapping("/stock")
public class StockController implements StockFeignApi {

    @Autowired
    private IStockService stockService;

    /**
     * 减少库存
     *
     * @param params 参数
     * @return 返回值
     */
    @Override
    public ResponseEntity<Integer> desc(StockEditParams params) {
        return ResponseEntity.ok(stockService.desc(params));
    }


    @PostMapping("/save")
    public ResponseEntity<Boolean> save(@RequestBody Stock params) {
        return ResponseEntity.ok(stockService.save(params));
    }
}
