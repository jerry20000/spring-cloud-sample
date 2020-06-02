package com.cloud.demo.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/2 15:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosTwoApplication.class, args);
    }
}
