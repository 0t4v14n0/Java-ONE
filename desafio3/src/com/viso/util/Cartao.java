package com.viso.util;

import java.math.BigInteger;

public class Cartao extends Bandeira implements Comparable<Cartao>{
	
	private String nome;
	
	public Cartao(BigInteger numeroCartao, String nome) {
		super(numeroCartao);
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Cartao o) {
		return 0;
	}
}
