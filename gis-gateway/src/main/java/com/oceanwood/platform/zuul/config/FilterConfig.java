package com.oceanwood.platform.zuul.config;

import com.oceanwood.platform.zuul.filter.HTTPBasicAuthorizeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterConfig {
	
	@Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        HTTPBasicAuthorizeFilter httpBasicFilter = new HTTPBasicAuthorizeFilter();
        registrationBean.setFilter(httpBasicFilter);  
        List<String> urlPatterns = new ArrayList<String>(1);  
        urlPatterns.add("/*");  
        registrationBean.setUrlPatterns(urlPatterns);  
        return registrationBean;  
    }
	
}
