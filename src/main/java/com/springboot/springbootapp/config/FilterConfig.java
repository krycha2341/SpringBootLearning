package com.springboot.springbootapp.config;

import com.springboot.springbootapp.filter.NewFilter;
import com.springboot.springbootapp.filter.NewFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<NewFilter> registrationBean(){

        FilterRegistrationBean<NewFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new NewFilter());
        registrationBean.addUrlPatterns("/medicines/id/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<NewFilter1> newFilter1FilterRegistrationBean(){

        FilterRegistrationBean<NewFilter1> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new NewFilter1());
        registrationBean.addUrlPatterns("/medicines");
        return registrationBean;

    }

}
