package com.praticaspring.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.praticaspring.cursomc.services.DBTestService;
import com.praticaspring.cursomc.services.EmailService;
import com.praticaspring.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class ApplicationTestConfig {
	
	@Autowired
	private DBTestService dbTestService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbTestService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
