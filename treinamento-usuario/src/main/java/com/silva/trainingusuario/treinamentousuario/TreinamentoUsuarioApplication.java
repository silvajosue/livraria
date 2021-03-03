package com.silva.trainingusuario.treinamentousuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class TreinamentoUsuarioApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(TreinamentoUsuarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.silva.trainingusuario.treinamentousuario.controller"))
				.paths(PathSelectors.any()).build();
	}
}
