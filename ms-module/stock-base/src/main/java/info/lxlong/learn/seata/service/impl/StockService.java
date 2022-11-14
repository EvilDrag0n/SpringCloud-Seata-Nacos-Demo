package info.lxlong.learn.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import info.lxlong.learn.seata.entity.Stock;
import info.lxlong.learn.seata.mapper.StockMapper;
import info.lxlong.learn.seata.params.StockEditParams;
import info.lxlong.learn.seata.service.IStockService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description 库存实现类
 * @author lxlong
 * @create 2022/11/11 14:27
 */
@Service
@Slf4j
public class StockService extends ServiceImpl<StockMapper, Stock> implements IStockService {

    /**
     * 减少库存数
     *
     * @param params 入参
     * @return 减少记录数
     */
    @Override
    @Transactional
    public Integer desc(StockEditParams params) {
        log.info("====> StockService xid == {}", RootContext.getXID());
        return baseMapper.desc(params);
    }
}
