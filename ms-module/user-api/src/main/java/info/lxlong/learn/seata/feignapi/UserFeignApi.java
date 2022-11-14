package info.lxlong.learn.seata.feignapi;

import info.lxlong.learn.seata.params.EditAmountParams;
import info.lxlong.learn.seata.vo.UserInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", path = "/user")
public interface UserFeignApi {

    /**
     * 减少金额
     *
     * @param params 参数
     * @return 返回值
     */
    @PostMapping("/desc-amount")
    ResponseEntity<Boolean> descAmount(@RequestBody @Validated EditAmountParams params);


    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return 返回值
     */
    @GetMapping("/info/{id}")
    ResponseEntity<UserInfoVo> info(@PathVariable("id") Long id);
}
