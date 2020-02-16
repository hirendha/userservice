package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.filter.UserServiceFilter;

public class UserServiceConfig implements WebMvcConfigurer {

	@Bean
	public FilterRegistrationBean<UserServiceFilter> loggingFilter() {
		
		FilterRegistrationBean<UserServiceFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new UserServiceFilter());
		registrationBean.addUrlPatterns("/global/*");
		return registrationBean;
	}
	
}
 