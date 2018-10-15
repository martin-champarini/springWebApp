package com.example.guru.springframework.springWebApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:othersource.properties")
})
public class WebConfiguration {

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.username}")
    private String username;

    @Value("${othersource.password}")
    private String otherPassword;

    @Value("${othersource.username}")
    private String otherUsername;

    @Bean
    @Primary
    public String getUsername() {
        return username;
    }

    @Bean
    public String getPassword() {
        return password;
    }

    @Bean
    public String getOtherPassword() {
        return otherPassword;
    }
    @Bean
    public String getOtherUsername() {
        return otherUsername;
    }
}
