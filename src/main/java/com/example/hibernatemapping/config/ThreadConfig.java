package com.example.hibernatemapping.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadConfig {
	
	
//	@Bean(name = "threadPoolExecutor")
//	public Executor getAsyncExecutor() {
//		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//		executor.setCorePoolSize(7);
//		executor.setMaxPoolSize(42);
//		executor.setQueueCapacity(11);
//		executor.setThreadNamePrefix("threadPoolExecutor-");
//		executor.initialize();
//		return executor;
//	}
//	
	@Bean(name = "ConcurrentTaskExecutor")
	public TaskExecutor taskExecutor () {
		return new ConcurrentTaskExecutor(
				Executors.newFixedThreadPool(10));
	}

}
