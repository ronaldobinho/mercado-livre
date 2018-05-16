package com.ronaldocarvalho.mercadolivre.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String remetente;
	
	private String assunto;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data;
	
	private String Mensagem;

	public Email() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}

	public Email(String remetente, String assunto, Date data, String mensagem) {
		super();
		this.remetente = remetente;
		this.assunto = assunto;
		this.data = data;
		Mensagem = mensagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email [id=");
		builder.append(id);
		builder.append(", remetente=");
		builder.append(remetente);
		builder.append(", assunto=");
		builder.append(assunto);
		builder.append(", data=");
		builder.append(data);
		builder.append(", Mensagem=");
		builder.append(Mensagem);
		builder.append("]");
		return builder.toString();
	}

}
