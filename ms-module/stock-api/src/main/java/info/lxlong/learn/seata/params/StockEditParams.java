package info.lxlong.learn.seata.params;

import lombok.Getter;
import lombok.Setter;

/**
 * @description 库存入参
 * @author lxlong
 * @create 2022/11/11 14:47
 */
@Getter
@Setter
public class StockEditParams {

    private Long productId;

    private Integer num;
}
