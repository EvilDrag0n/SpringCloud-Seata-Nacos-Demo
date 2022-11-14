package info.lxlong.learn.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description 启动类
 * @author lxlong
 * @date 2022/11/14 15:25
 */
@SpringBootApplication
@EnableFeignClients
//无需对外提供服务，不需要像nacos注册
@EnableDiscoveryClient(autoRegister = false)
public class MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }
}
