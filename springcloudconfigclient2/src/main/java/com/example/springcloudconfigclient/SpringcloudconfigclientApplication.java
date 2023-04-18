package com.example.springcloudconfigclient;

import com.example.springcloudconfigclient.auth.Authproperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@EnableConfigurationProperties(Authproperties.class)
@RestController
public class SpringcloudconfigclientApplication {


    private Authproperties authproperties;
    @Value("${spring.name}")
    private String name;

    public SpringcloudconfigclientApplication(Authproperties authproperties) {
        this.authproperties = authproperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigclientApplication.class, args);
    }

    @GetMapping("/get")
    public Map<String, String> getUsername() {

        HashMap<String, String> ans = new HashMap<>();
        ans.put("name",authproperties.getName());
        ans.put("pass",authproperties.getPass());
        ans.put("secretkey",authproperties.getSecretkey());
        return ans;
    }
}
