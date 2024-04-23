package com.viso.util;

public class Compra {
	
	private String nome;
	private double preco;
	private int quantidade;
	private static double Limite = 600.50;

	public Compra(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quanidade) {
		this.quantidade = quanidade;
	}
	
	public static double getLimite() {
		return Limite;
	}
	
	public double totalProduo() {
		return preco * quantidade;
	}
	
	public String toString() {
		return "Produto: "+nome+" Preco: "+preco+" Quantidade: "+quantidade;
	}
	
}
