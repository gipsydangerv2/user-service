package com.ankit.userservice.userservice;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "payment-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentServiceConfig {
    private String basePath;
    private String userPaymentApi;
    private String allUsersPaymentApi;
}
