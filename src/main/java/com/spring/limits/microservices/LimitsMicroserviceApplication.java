package com.spring.limits.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//This will make all controllers fault tolerance
//Use another annotation in controller
@EnableHystrix
@SpringBootApplication
public class LimitsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsMicroserviceApplication.class, args);
	}

}
