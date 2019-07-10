----
#### 作用一：Zuul路由网关
###### 简介：Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能。

#### 新建工程
###### 参考pom.xml文件

#### 启动类
###### 参考app.java

#### 路由方式
###### 参考application.yml

----
#### 作用二：服务过滤
###### 简介：zuul不仅只是路由，并且还能过滤，做一些安全验证。 参考MyZuulFilter

