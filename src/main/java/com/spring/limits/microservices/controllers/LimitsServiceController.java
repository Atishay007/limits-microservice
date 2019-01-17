package com.spring.limits.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.limits.microservices.vo.LimitConfigurationVO;

@RestController
public class LimitsServiceController {

	@Autowired
	private LimitConfigurationVO limitConfigVO;

	@GetMapping("/limitService")
	private String getLimitServiceConfigVO() {
		return "Max Limit is : " + limitConfigVO.getMaxConfiguration();
	}
}
