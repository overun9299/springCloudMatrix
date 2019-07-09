package overun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务的提供者
 */

@EnableEurekaClient
@SpringBootApplication
public class EurekclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekclientApplication.class, args);
    }

}
