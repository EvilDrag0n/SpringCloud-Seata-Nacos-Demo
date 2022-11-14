package info.lxlong.learn.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import info.lxlong.learn.seata.entity.Stock;
import info.lxlong.learn.seata.params.StockEditParams;

public interface IStockService extends IService<Stock> {

    /**
     * 减少库存数
     *
     * @param params 入参
     * @return 减少记录数
     */
    Integer desc(StockEditParams params);
}
