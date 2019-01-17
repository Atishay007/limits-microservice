package com.spring.limits.microservices.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")
public class LimitConfigurationVO {

	private int maxConfiguration;
	private int minConfiguration;

	public LimitConfigurationVO() {
		super();
	}

	public LimitConfigurationVO(int maxConfiguration, int minConfiguration) {
		super();
		this.maxConfiguration = maxConfiguration;
		this.minConfiguration = minConfiguration;
	}

	public int getMaxConfiguration() {
		return maxConfiguration;
	}

	public void setMaxConfiguration(int maxConfiguration) {
		this.maxConfiguration = maxConfiguration;
	}

	public int getMinConfiguration() {
		return minConfiguration;
	}

	public void setMinConfiguration(int minConfiguration) {
		this.minConfiguration = minConfiguration;
	}

}
