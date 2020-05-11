package com.youfei.dppsconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DppsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DppsConsumerApplication.class, args);
	}

}
