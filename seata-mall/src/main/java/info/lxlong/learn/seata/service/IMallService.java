package info.lxlong.learn.seata.service;

import info.lxlong.learn.seata.params.CreateOrderParams;
import info.lxlong.learn.seata.vo.CreateOrderVo;

/**
 * 商城业务接口
 * @author 楼上科技01
 */
public interface IMallService {

    CreateOrderVo create(CreateOrderParams params);
}
