package com.ronaldocarvalho.mercadolivre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronaldocarvalho.mercadolivre.domain.Email;


@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{
	
}
