package info.lxlong.learn.seata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import info.lxlong.learn.seata.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends BaseMapper<Order> {
}
