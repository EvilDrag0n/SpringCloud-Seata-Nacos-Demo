package info.lxlong.learn.seata.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @description 用户金额参数
 * @author lxlong
 * @create 2022/11/11 17:23
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditAmountParams {

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空")
    private Long id;

    /**
     * 金额
     */
    @NotNull(message = "金额不能为空")
    @Min(value = 0, message = "金额不可小于0")
    private BigDecimal amount;
}
