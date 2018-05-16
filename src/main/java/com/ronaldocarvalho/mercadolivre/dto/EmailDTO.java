package com.ronaldocarvalho.mercadolivre.dto;

import java.io.Serializable;
import java.util.Date;

import com.ronaldocarvalho.mercadolivre.domain.Email;


public class EmailDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String remetente;
	private String assunto;
	private Date data;
	private String mensagem;
	
	public EmailDTO() {
		
	}
	
	public EmailDTO(Email obj) {
		id = obj.getId();
		remetente = obj.getRemetente();
		assunto = obj.getAssunto();
		mensagem = obj.getMensagem();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}
