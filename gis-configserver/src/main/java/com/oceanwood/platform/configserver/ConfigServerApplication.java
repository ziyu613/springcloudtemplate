package com.oceanwood.platform.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 配置管理中心服务
 *
 * @author By TianF
 **/
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConfigServerApplication extends SpringBootServletInitializer {
    public static void main (String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
