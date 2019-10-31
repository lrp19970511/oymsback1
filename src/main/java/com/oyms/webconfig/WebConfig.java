package com.oyms.webconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.oyms.util.JWTInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//添加拦截器
		registry.addInterceptor(new JWTInterceptor()).excludePathPatterns("/user/register","/user/login","/file/upload");//放掉某些特定不需要校验token的路由
	}
}

