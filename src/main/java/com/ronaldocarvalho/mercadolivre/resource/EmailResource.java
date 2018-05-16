package com.ronaldocarvalho.mercadolivre.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldocarvalho.mercadolivre.domain.Email;
import com.ronaldocarvalho.mercadolivre.dto.EmailDTO;
import com.ronaldocarvalho.mercadolivre.service.EmailService;


@RestController
@RequestMapping(value="/emails")
public class EmailResource {
	
	@Autowired
	private EmailService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EmailDTO>> findAll() {
		List<Email> list = service.findAll();
		List<EmailDTO> listDto = list.stream().map(obj -> new EmailDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/email")
	public String lista() {
		return service.toString();
	}
}
