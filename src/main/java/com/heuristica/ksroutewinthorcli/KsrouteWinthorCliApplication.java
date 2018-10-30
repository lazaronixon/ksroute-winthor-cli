package com.heuristica.ksroutewinthorcli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KsrouteWinthorCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(KsrouteWinthorCliApplication.class, args);
    }
}
