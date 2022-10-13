package com.example.springcloudconfigsever;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudconfigseverApplication {
	@Value("user.name")
	private static String username;

	public static void main(String[] args) {

		SpringApplication.run(SpringcloudconfigseverApplication.class, args);
	}

}
