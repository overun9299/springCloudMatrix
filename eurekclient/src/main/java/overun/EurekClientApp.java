package overun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务的提供者
 */

@EnableEurekaClient
@SpringBootApplication
public class EurekClientApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekClientApp.class, args);
    }

}
