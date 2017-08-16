package com.xyz.spring.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDemoApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(SpringCloudDemoApplication.class).web(true).run(args);
		SpringApplication.run(SpringCloudDemoApplication.class, args);
	}
}