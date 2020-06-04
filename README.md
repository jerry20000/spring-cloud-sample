1. 安装nacos
   ```
   下载nacos1.2.1版本：https://github.com/alibaba/nacos/releases
    安装命令：sh startup.sh -m standalone 或 bash -f ./startup.sh -m standalone
    
2. 安装Sentinel
   ```
   下载Sentinel1.7.2版本：https://github.com/alibaba/Sentinel/releases
    安装命令：
    nohub java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.7.2.jar.jar &
    
1. 介绍
   ```
   Springcloud Alibaba
   
   Nacos注册中心与配置中心
   Sentinel流量控制，服务降级，熔断
   OpenFeign的声明式方式定义Web服务客户端；其次还更进一步，通过集成Ribbon实现负载均衡的HTTP客户端。
   
   项目介绍：
   #nacos-gateway-config: springcloud gateway动态路由，集成nacos配置
   #nacos-service-one：nacos微服务应用，集成nacos配置，sentinel服务降级；feignclient标准调用消费方；流控规则持久化到nacos
   #nacos-service-two：nacos微服务应用，集成nacos配置，sentinel服务降级；feignclient标准调用提供方，封装feign提供方接口
   #elk: logstash + elasticsearch + kibana 日志收集demo
   #slf4-mdc: 日志链路跟踪，需要的模块引入该jar包即可，日志自动收集到logstash
            
            
            