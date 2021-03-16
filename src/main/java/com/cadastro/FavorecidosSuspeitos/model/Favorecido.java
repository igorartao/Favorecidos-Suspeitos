package com.cadastro.FavorecidosSuspeitos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blackListFavorecidos")
public class Favorecido {
	
	@Id
	private String nuCpfCnpj;

	public Favorecido() {

	}

	public Favorecido(String nuCpfCnpj) {
		this.nuCpfCnpj = nuCpfCnpj;
	}

	public String getNuCpfCnpj() {
		return nuCpfCnpj;
	}

	public void setNuCpfCnpj(String nuCpfCnpj) {
		this.nuCpfCnpj = nuCpfCnpj;
	}

	@Override
	public String toString() {
		return "Favorecido [nuCpfCnpj=" + nuCpfCnpj + "]";
	}

}
