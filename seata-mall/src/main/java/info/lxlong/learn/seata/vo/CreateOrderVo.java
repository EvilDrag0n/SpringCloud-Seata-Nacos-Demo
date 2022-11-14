package info.lxlong.learn.seata.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 创建订单返回视图类
 *
 * @author lxlong
 * @date 2022/11/14 16:21
 */
@Getter
@Setter
@Builder
public class CreateOrderVo {

    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户余额
     */
    private BigDecimal balance;
}
