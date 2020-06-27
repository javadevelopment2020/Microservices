package com.in28minutes.micrcoservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.micrcoservices.limitsservice.bean.LimitConfiguration;

@RestController	
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
