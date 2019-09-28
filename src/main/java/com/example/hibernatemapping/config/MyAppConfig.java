package com.example.hibernatemapping.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

import com.example.hibernatemapping.controller.LoggingInterceptor;

@Configuration
public class MyAppConfig implements WebMvcConfigurer{

	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new LoggingInterceptor());
	}
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	/*@Bean
	public ViewResolver contentNegotiatingViewResolver() {
	    ContentNegotiatingViewResolver resolver =
	            new ContentNegotiatingViewResolver();

	    List<View> views = new ArrayList<>();
	    views.add(new MappingJackson2XmlView());
	    views.add(new MappingJackson2JsonView());

	    resolver.setDefaultViews(views);
	    return resolver;
	    
	} */
	
	
}
