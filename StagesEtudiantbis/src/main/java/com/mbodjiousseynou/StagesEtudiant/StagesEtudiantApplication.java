package com.mbodjiousseynou.StagesEtudiant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mbodjiousseynou.StagesEtudiant.entities.Stage;
import com.mbodjiousseynou.StagesEtudiant.repository.StagesEtudiantRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StagesEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagesEtudiantApplication.class, args);
	}
	@Bean
	CommandLineRunner start( StagesEtudiantRepository stagesEtudiantRepository) {
		return args->{
			stagesEtudiantRepository.save(new Stage(null,"Atos Senegal",1L));
			stagesEtudiantRepository.save(new Stage(null,"Avenir Immo",2L));
			
		};
	}

}
