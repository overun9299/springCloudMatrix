----
#### ribbon简介
###### ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon


#### 准备工作
###### 启动eureka-server 工程；启动eureka-client工程，它的端口为9702；将eureka-client的配置文件的端口改为9703,并启动，这时你会发现：eureka-client在eureka-server注册了2个实例，这就相当于一个小的集群


#### 创建消费者
###### 重新新建一个spring-boot工程，取名为：service-ribbon   参考本module的pom.xml;


#### Service的实现
###### 参考RibbonServiceImpl,java

----
### 断路器（熔断器）


#### 熔断器作用
###### 在微服务架构中，根据业务来拆分成一个个的服务，服务与服务之间可以相互调用（RPC），在Spring Cloud可以用RestTemplate+Ribbon和Feign来调用。为了保证其高可用，单个服务通常会集群部署。由于网络原因或者自身的原因，服务并不能保证100%可用，如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若有大量的请求涌入，Servlet容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，这就是服务故障的“雪崩”效应。

#### 引入依赖
###### 参考本module的pom.xml

#### 开启注解
###### 在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix：

#### 熔断后处理
###### 在Service实现方法上加上@HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法 ，参考本module的RibbonServiceImpl
