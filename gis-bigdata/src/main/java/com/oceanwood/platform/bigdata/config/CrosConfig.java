package com.oceanwood.platform.bigdata.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * cros config
 *
 * @author By TianF
 **/

public class CrosConfig extends WebMvcConfigurationSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(CrosConfig.class);

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
        LOGGER.info("WebMVC configuration : addCorsMappings");
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
