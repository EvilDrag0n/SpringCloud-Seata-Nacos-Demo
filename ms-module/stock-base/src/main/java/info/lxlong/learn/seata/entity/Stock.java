package info.lxlong.learn.seata.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description 库存
 * @author lxlong
 * @create 2022/11/11 14:23
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_product_stock")
public class Stock implements Serializable {
    /**
     * 库存id
     */
    private Long id;
    /**
     * 商品名
     */
    private String name;
    /**
     * 库存数
     */
    private Integer stock;
}