package com.busmap.server.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.busmap.server")
@EnableJpaRepositories(basePackages = "com.busmap.server")
public class JpaConfig {
}
