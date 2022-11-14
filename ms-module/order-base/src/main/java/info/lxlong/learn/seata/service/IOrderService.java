package info.lxlong.learn.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import info.lxlong.learn.seata.entity.Order;
import info.lxlong.learn.seata.params.SaveOrderParams;

public interface IOrderService extends IService<Order> {

    /**
     * 新增订单
     * @param params    入参
     * @return
     */
    Long insert(SaveOrderParams params);
}
