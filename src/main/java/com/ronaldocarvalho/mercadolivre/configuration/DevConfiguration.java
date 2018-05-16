package com.ronaldocarvalho.mercadolivre.configuration;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ronaldocarvalho.mercadolivre.service.DBService;

@Configuration
@Profile("dev")
public class DevConfiguration {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instanciateDatabase() throws ParseException, IOException,
			GeneralSecurityException {
		dbService.instantiateDatabase();
		return true;
	}
}
