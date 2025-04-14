package com.jovan.back_v2;

import org.springframework.boot.SpringApplication;

public class TestBackV2Application {

	public static void main(String[] args) {
		SpringApplication.from(BackV2Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
