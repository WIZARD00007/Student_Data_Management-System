package com.akshay.webApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages= "com.akshay.webApp")
public class MyWebAppUsingModelAndView2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppUsingModelAndView2Application.class, args);
	}

}
