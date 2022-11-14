package info.lxlong.learn.seata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import info.lxlong.learn.seata.entity.Stock;
import info.lxlong.learn.seata.params.StockEditParams;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMapper extends BaseMapper<Stock> {
    Integer desc(StockEditParams params);
}
