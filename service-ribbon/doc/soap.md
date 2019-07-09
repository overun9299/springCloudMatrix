----
#### ribbon简介
###### ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon

----
#### 准备工作
###### 启动eureka-server 工程；启动eureka-client工程，它的端口为9702；将eureka-client的配置文件的端口改为9703,并启动，这时你会发现：eureka-client在eureka-server注册了2个实例，这就相当于一个小的集群

----
#### 创建消费者
###### 重新新建一个spring-boot工程，取名为：service-ribbon   参考本module的pom.xml;

----
#### Service的实现
###### 参考RibbonServiceImpl,java
