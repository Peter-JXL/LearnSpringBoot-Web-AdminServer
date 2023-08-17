package com.peterjxl.learnspringbootwebadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer // 开启监控
public class LearnSpringBootWebAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootWebAdminServerApplication.class, args);
    }

}
