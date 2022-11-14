package info.lxlong.learn.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import info.lxlong.learn.seata.entiry.User;
import info.lxlong.learn.seata.mapper.UserMapper;
import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.service.IUserService;
import info.lxlong.learn.seata.vo.UserInfoVo;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description 用户业务实现类
 * @author lxlong
 * @create 2022/11/11 18:06
 */
@Service
@Slf4j
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    /**
     * 减少用户金额
     *
     * @param params 入参
     * @return 是否成功
     */
    @Override
    public Boolean descAmount(EditAmountParams params) {
        log.info("====> userService xid == {}", RootContext.getXID());
        return baseMapper.desc(params) == 1;
    }

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 返回值
     */
    @Override
    public UserInfoVo info(Long id) {
        return baseMapper.info(id);
    }
}
