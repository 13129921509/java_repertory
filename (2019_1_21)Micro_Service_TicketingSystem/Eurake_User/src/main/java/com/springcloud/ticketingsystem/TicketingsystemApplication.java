package com.springcloud.ticketingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class TicketingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingsystemApplication.class, args);
    }

}

