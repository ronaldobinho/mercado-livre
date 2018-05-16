package com.ronaldocarvalho.mercadolivre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldocarvalho.mercadolivre.domain.Email;
import com.ronaldocarvalho.mercadolivre.repository.EmailRepository;


@Service
public class EmailService {
	@Autowired
	private EmailRepository emailRepository;
	
	public List<Email> findAll( ) {
		return emailRepository.findAll();
	}
}
