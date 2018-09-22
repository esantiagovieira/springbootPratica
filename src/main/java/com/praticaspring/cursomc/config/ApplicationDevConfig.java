package com.praticaspring.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.praticaspring.cursomc.services.DBTestService;

@Configuration
@Profile("dev")
public class ApplicationDevConfig {
	
	@Autowired
	private DBTestService dbTestService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		if(!"create".equals(strategy)) {
			return false;
		}
		dbTestService.instantiateTestDatabase();
		return true;
	}

}
