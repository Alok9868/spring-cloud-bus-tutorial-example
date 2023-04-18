package com.example.springcloudconfigsever;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { RabbitAutoConfiguration.class })
@EnableConfigServer
@RestController
public class SpringcloudconfigseverApplication {
	@GetMapping("/get")
	public String get()
	{
		return "asdf";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringcloudconfigseverApplication.class, args);
	}




}
