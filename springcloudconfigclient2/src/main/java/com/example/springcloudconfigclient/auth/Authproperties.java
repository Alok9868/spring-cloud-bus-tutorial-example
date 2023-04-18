package com.example.springcloudconfigclient.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("spring")
public class Authproperties {

    private String name;
    private String pass;
    private String secretkey;
}
