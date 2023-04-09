package com.hamza.thymeleaf;

import com.hamza.thymeleaf.entities.Patient;
import com.hamza.thymeleaf.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}



	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args->{

    patientRepository.save(new Patient(null,"hamza",new Date(),false,12));
			patientRepository.save(new Patient(null,"haytam",new Date(),true,12));
			patientRepository.save(new Patient(null,"hssna",new Date(),false,12));
			patientRepository.save(new Patient(null,"hatim",new Date(),true,12));



patientRepository.findAll().forEach(p->{
	System.out.println(p.getNom());
});

		};
	}

















}
