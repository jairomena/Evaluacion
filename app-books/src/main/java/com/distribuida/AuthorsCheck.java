package com.distribuida;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import java.time.LocalDateTime;

@ApplicationScoped
@Liveness
public class AuthorsCheck implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("app-authors")
                .withData("time", LocalDateTime.now().toString())
                .up()
                .build();
    }
}
