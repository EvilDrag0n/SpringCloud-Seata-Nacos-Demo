package info.lxlong.learn.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description 订单启动类
 * @author lxlong
 * @create 2022/11/11 14:30
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("info.lxlong.learn.seata.mapper")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
