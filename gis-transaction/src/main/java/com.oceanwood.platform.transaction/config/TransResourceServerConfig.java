package com.oceanwood.platform.transaction.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 服务资源配置类
 *
 * @author By TianF
 **/

@Configuration
@EnableResourceServer
public class TransResourceServerConfig extends ResourceServerConfigurerAdapter {
}
