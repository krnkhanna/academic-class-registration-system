package org.genesys.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "org.genesys")
@EnableR2dbcRepositories(basePackages = "org.genesys")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}