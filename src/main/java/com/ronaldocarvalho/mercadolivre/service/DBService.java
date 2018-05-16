package com.ronaldocarvalho.mercadolivre.service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.services.gmail.Gmail;
import com.ronaldocarvalho.mercadolivre.domain.Email;
import com.ronaldocarvalho.mercadolivre.repository.EmailRepository;

@Service
public class DBService {

	@Autowired
	private EmailRepository emailRepository;

	public void instantiateDatabase() throws ParseException, IOException,
			GeneralSecurityException {

		Email email1 = new Email("Ronaldo", "DevOps", null, "DevOps");

		GmailQuickstart gmail = new GmailQuickstart();
		gmail.buscar();
	}

}
