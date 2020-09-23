package com.harshit.uploadexcelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UploadExcelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadExcelServiceApplication.class, args);
	}

}
