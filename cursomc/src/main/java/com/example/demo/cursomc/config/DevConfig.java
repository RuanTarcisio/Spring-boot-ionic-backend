package com.example.demo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.cursomc.services.DBService;

	@Configuration
	@Profile("dev")
	public class DevConfig {
		
		@Autowired
		private DBService dbService;
		
		@Bean
		public boolean instantiateDataBase() throws ParseException {
			dbService.instantiateDataBase();
			return true;
		}
}
