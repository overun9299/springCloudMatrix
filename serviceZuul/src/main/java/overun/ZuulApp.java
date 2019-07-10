package overun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: app
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/9 16:14
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 *
 * @EnableZuulProxy 网关
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulApp {


    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class ,args);
    }
}
