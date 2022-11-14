package info.lxlong.learn.seata.entiry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description 用户表
 * @author lxlong
 * @create 2022/11/11 17:26
 */
@Getter
@Setter
@Builder
@TableName("t_user")
public class User implements Serializable {

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
