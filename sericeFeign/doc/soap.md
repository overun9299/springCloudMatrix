----
#### Feign简介
###### Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。

----
#### 创建一个feign的服务
###### 新建一个spring-boot工程，取名为serice-feign，在它的pom文件引入Feign的起步依赖spring-cloud-starter-feign、Eureka的起步依赖spring-cloud-starter-netflix-eureka-client、Web的起步依赖spring-boot-starter-web，参考该module的pom.xml

###### 在工程的配置文件application.yml文件，指定程序名为service-feign，端口号为8765，服务注册地址为http://127.0.0.1:9700/eureka/ ，参考该module的application.yml：

----
#### 启动类
###### 参考app.java(在程序的启动类app ，加上@EnableFeignClients注解开启Feign的功能)

----
#### 接口
###### 参考FeignService.java接口 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了eureka-client服务的“/port”接口

----
#### Controller
###### 参考FeignController.java 普通的controller层写法

