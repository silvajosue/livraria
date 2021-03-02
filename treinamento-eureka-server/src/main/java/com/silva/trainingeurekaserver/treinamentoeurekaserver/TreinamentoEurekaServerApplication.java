package com.silva.trainingeurekaserver.treinamentoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TreinamentoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoEurekaServerApplication.class, args);
	}

}
