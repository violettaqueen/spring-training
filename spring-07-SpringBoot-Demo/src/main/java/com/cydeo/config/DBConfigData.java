package com.cydeo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@ConfigurationProperties(prefix = "db")
@Configuration
@Data

public class DBConfigData {

    private String userName;
    private String password;
    private List<String> type;


}
