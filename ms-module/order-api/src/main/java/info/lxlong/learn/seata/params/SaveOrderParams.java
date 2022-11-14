package info.lxlong.learn.seata.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @description 新增订单入参
 * @author lxlong
 * @create 2022/11/11 11:03
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveOrderParams {

    @NotNull(message = "不能为空")
    private Long userId;

    @NotNull(message = "商品id不能为空")
    private Long productId;

    /**
     * 商品数量
     */
    private Integer productNum;
}
