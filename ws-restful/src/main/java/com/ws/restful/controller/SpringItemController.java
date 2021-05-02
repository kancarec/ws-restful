package com.ws.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.restful.beans.ComponentBean;
import com.ws.restful.beans.ConfigurationBean;

@RestController
@RequestMapping("/api/v1/spring")
public class SpringItemController {

	@Autowired
	ConfigurationBean cnfgBean;

	@Autowired
	ComponentBean compBean;

	@Value("${name}")
	private String appName;

	@Value("#{'${app.users}'.split(',')}")
	List<String> appUsers;

	@GetMapping("/getAppProperties")
	String getAppName() {
		return appName;

	}

	@GetMapping("/getAppUsers")
	String getAppUser() {
		String userList = "";
		for (String ad : appUsers) {
			userList = ad + "," + userList;
		}
		return userList;
	}

	@GetMapping("/getBeanName")
	String getBeanName() {
	
		return "Cfng: " + cnfgBean.getName() + " / " + " Component: " + compBean.getName();
	}
}
