package com.youfei.dppsprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DppsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DppsProviderApplication.class, args);
	}

}

