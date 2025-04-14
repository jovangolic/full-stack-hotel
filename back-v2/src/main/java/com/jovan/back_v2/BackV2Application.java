package com.jovan.back_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jovan.back_v2")
@EntityScan("com.jovan.back_v2")
public class BackV2Application {

	public static void main(String[] args) {
		SpringApplication.run(BackV2Application.class, args);
	}

}
