package info.lxlong.learn.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import info.lxlong.learn.seata.entiry.User;
import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.vo.UserInfoVo;

public interface IUserService extends IService<User> {

    /**
     * 减少用户金额
     * @param params    入参
     * @return  是否成功
     */
    Boolean descAmount(EditAmountParams params);

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 返回值
     */
    UserInfoVo info(Long id);
}
