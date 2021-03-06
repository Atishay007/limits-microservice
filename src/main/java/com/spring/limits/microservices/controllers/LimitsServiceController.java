package com.spring.limits.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.limits.microservices.vo.LimitConfigurationVO;

@RestController
public class LimitsServiceController {

	@Autowired
	private LimitConfigurationVO limitConfigVO;

	@GetMapping("/limitService")
	private String getLimitServiceConfigVO() {
		return "Max Limit is : " + limitConfigVO.getMaxConfiguration() + ": Min Limit is "
				+ limitConfigVO.getMinConfiguration();
	}

	// This is a fallback method using Hystrix.
	// For using Hystriz we have to use @EnableHystrix
	// on the starting of Spring Boot Application.
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallBackRetrieveConfiguration")
	public LimitConfigurationVO retrieveLimitConfig() {
		throw new RuntimeException("Exception occurred while retrieving LimitConfiguration");
	}

	public LimitConfigurationVO fallBackRetrieveConfiguration() {
		return new LimitConfigurationVO(99, 9);
	}
}
