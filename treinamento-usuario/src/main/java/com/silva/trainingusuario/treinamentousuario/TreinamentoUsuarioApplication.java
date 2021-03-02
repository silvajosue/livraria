package com.silva.trainingusuario.treinamentousuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TreinamentoUsuarioApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(TreinamentoUsuarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
