package com.silva.trainingserver.treinamento;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TreinamentoServerApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(TreinamentoServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
