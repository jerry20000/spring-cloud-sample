package com.cloud.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/3 13:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosGatewayConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGatewayConfigApplication.class, args);
    }

}
