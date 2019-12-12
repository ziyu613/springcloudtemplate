package com.oceanwood.platform.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * logger application
 *
 * @author By TianF
 **/
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LoggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class, args);
    }
}
