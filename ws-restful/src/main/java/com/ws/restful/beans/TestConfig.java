package com.ws.restful.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	public ConfigurationBean testBean() {
		return new ConfigurationBean();
	}
}
