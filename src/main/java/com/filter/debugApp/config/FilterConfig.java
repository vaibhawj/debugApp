package com.filter.debugApp.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationExceptionProneFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new ExcceptionProneFilter());
        registrationBean.setOrder(FilterRegistrationBean.HIGHEST_PRECEDENCE + 1);

        return registrationBean;
    }

    //    @Bean
    public FilterRegistrationBean filterRegistrationExceptionHandler(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new ExceptionHandlerFilter());
        registrationBean.setOrder(FilterRegistrationBean.HIGHEST_PRECEDENCE);

        return registrationBean;
    }
}
