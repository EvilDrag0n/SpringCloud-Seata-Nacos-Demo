package info.lxlong.learn.seata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import info.lxlong.learn.seata.entiry.User;
import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.vo.UserInfoVo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    Integer desc(EditAmountParams params);

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 返回值
     */
    UserInfoVo info(Long id);
}
