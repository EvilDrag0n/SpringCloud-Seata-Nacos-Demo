package info.lxlong.learn.seata.controller;

import info.lxlong.learn.seata.params.CreateOrderParams;
import info.lxlong.learn.seata.service.IMallService;
import info.lxlong.learn.seata.vo.CreateOrderVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description 商城请求控制器
 * @author lxlong
 * @create 2022/11/14 15:32
 * @date 2022/11/14 15:32
 */
@RestController
@RequestMapping("/mall")
public class MallController {

    @Resource
    private IMallService mallService;


    @PostMapping("/create")
    public ResponseEntity<CreateOrderVo> createOrder(@RequestBody CreateOrderParams params) {
        return ResponseEntity.ok(mallService.create(params));
    }
}
