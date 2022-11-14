package info.lxlong.learn.seata.controller;

import info.lxlong.learn.seata.feignapi.UserFeignApi;
import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.service.IUserService;
import info.lxlong.learn.seata.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 用户控制器
 * @author lxlong
 * @create 2022/11/11 18:03
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserFeignApi {

    @Autowired
    private IUserService userService;


    /**
     * 减少用户金额
     *
     * @param params 参数
     * @return 返回值
     */
    @Override
    public ResponseEntity<Boolean> descAmount(EditAmountParams params) {
        return ResponseEntity.ok(userService.descAmount(params));
    }

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 返回值
     */
    @Override
    public ResponseEntity<UserInfoVo> info(Long id) {
        return ResponseEntity.ok(userService.info(id));
    }
}
