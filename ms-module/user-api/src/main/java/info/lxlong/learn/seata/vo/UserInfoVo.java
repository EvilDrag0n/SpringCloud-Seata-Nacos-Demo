package info.lxlong.learn.seata.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 用户信息
 *
 * @author lxlong
 * @date 2022/11/14 16:16
 */
@Getter
@Setter
public class UserInfoVo {
    /**
     * id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 金额
     */
    private BigDecimal money;
}
