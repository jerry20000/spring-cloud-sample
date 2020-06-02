package com.cloud.demo.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/2 15:06
 */
@SpringBootApplication(scanBasePackages = {"com.cloud.demo.one.*","com.cloud.demo.two.*"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.cloud.demo.two.*"})
public class NacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }
}
