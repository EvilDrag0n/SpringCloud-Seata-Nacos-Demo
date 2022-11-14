package info.lxlong.learn.seata.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description 订单
 * @author lxlong
 * @create 2022/11/11 14:23
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_order")
public class Order implements Serializable {
    /**
     * 订单id
     */
    private Long id;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商品数量
     */
    private Integer productNum;
}