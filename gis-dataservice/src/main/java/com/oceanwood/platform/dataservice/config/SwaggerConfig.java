package com.oceanwood.platform.dataservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger config
 *
 * @author By TianF
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("数据服务类").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.oceanwood.platform.dataservice.controller")).paths(PathSelectors.any()).build();
    }

    // 预览地址:swagger-ui.html
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("数据服务类API文档").termsOfServiceUrl("http://shch.qyec.com/").version("1.0").build();
    }
}
