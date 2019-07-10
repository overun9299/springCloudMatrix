package overun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: app
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 13:51
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class , args);
    }
}
