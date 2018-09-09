# xlfd-cloud
springcloud技术栈架构学习

xlfd-cloud-eureka   注册中心  8100	

xlfd-cloud-gateway	api网关     8120	

xlfd-cloud-auth2-center	认证中心   8130	

xlfd-cloud-turbine  断路器聚合监控  8140

xlfd-cloud-admin    微服务监控   8150

xlfd-cloud-zipkin   服务链路追踪  8160

xlfd-cloud-api  api模块

xlfd-cloud-common   common模块

xlfd-cloud-core     core模块

xlfd-cloud-user     user服务    8200

xlfd-cloud-order    order服务   8210

xlfd-cloud-inventory   inventory服务  8220

xlfd-cloud-rabbitmq 消息服务    8300

xlfd-cloud-apollo-client  apollo客户端应用示例 8310



# 待完成
1.集成ELK实时分布式日志系统

2.基于oauth2和JWT搭建认证中心

3.优化

4.turbine,admin,zipkin三合一monitor

因为SBA最新版本为2.0.1，而spring-boot-admin-server-ui-turbine的版本为1.5.7，整合会出现问题，暂时分开使用

5.feign调用token传递问题

