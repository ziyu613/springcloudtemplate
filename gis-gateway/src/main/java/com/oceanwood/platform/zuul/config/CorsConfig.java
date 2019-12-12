package com.oceanwood.platform.zuul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域配置文件
 *
 * @author By TianF
 */
@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    @Override  
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowedHeaders("*")
                .allowCredentials(true)  
                .allowedMethods("*")  
                .maxAge(3600);  
    }  

}
