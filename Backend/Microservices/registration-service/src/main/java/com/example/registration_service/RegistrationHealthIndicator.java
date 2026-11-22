package com.example.registration_service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RegistrationHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        try {
            return Health.up()
                    .withDetail("registration", "Service d'inscription opérationnel")
                    .build();
        } catch (Exception e) {
            return Health.down()
                    .withDetail("registration", "Service d'inscription indisponible")
                    .withException(e)
                    .build();
        }
    }
}
