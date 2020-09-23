package com.harshit.userdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDashboardApplication.class, args);
	}

}
