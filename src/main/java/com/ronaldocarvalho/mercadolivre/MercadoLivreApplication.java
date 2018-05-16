package com.ronaldocarvalho.mercadolivre;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListLabelsResponse;

@SpringBootApplication
public class MercadoLivreApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MercadoLivreApplication.class, args);

	}
}
