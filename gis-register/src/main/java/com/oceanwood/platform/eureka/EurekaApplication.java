package com.oceanwood.platform.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心类
 *
 * @author By TianF
 **/
@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EurekaApplication {
    public static void main (String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
