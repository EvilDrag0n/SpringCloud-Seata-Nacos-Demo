package info.lxlong.learn.seata.params;

import lombok.Getter;
import lombok.Setter;

/**
 * 创建订单入参
 *
 * @author lxlong
 * @date 2022/11/14 16:03
 */
@Getter
@Setter
public class CreateOrderParams {

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商品id
     */
    private Long productId;

    /**
     * 商品数量
     */
    private Integer productNum;
}
