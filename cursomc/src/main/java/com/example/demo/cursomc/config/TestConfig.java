package com.example.demo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.cursomc.services.DBService;
import com.example.demo.cursomc.services.EmailService;
import com.example.demo.cursomc.services.MockEmailService;

	@Configuration
	@Profile("test")
	public class TestConfig {
		
		@Autowired
		private DBService dbService;
		
		@Bean
		public boolean instantiateDataBase() throws ParseException {
			dbService.instantiateTestDatabase();
			return true;
		}
		
		@Bean
		public EmailService emailService() {
			return new MockEmailService();
		}
}
