package com.in28min.microservices.limits_service.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Configuration {
    private int minimum;
    private int maximum;
}
