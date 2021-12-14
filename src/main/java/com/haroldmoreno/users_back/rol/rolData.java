package com.haroldmoreno.users_back.rol;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;

@Configuration
public class rolData {
	@Bean
	CommandLineRunner CommandLineRunner(rolRepository rRol) {
		return args -> {
			if(rRol.count() == 0) {
				rRol.saveAll(List.of(new rol("Administrador"), new rol("Auditor"), new rol("Auxiliar")));				
			}
		};
	}
}
