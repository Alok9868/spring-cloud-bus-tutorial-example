package com.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@RestController
@RefreshScope
@EnableEurekaClient
public class SpringcloudconfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigclientApplication.class, args);
	}

	@Value("${user.secretkey}")
	private String username;

	@GetMapping("/get")
	public String getUsername()
	{
		return username;
	}
}
