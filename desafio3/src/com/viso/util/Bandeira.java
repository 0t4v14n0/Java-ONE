package com.viso.util;

import java.math.BigInteger;

public class Bandeira{
	
	private BigInteger numeroCartao;
	
	//variaveis
	int primeiroDigito = 0;
	int doisPrimeirosDigitos = 0;
	int tresPrimeirosDigitos = 0;
	int quatroPrimeirosDigitos = 0;
	
	public BigInteger getNumeroCartao() {
		return numeroCartao;
	}
	
	public Bandeira(BigInteger numero) {
		this.numeroCartao = numero;
	}
	
	//retorna a bandeira do cartao
	public String getBandeira() {
		
		calcInicioCartao();
		
		if(doisPrimeirosDigitos == 35) {
			return "JCB";
		}
		else if(doisPrimeirosDigitos == 37) {
			return "American Express";
		}	
		else if(primeiroDigito == 4) {
			return "Visa";
		}
		else if(primeiroDigito == 5) {
			return "Master";
		}
		else if(primeiroDigito == 6) {
			return "Discover";
		}
		else {
			return "Bandeira nao indentificada";
		}
	}
	
	public boolean getValidacao() {
		
		String segura = ""+numeroCartao;//kkkkk baianagi
		
		int quantidadeDigitos = segura.length();//quantidade de caracteres
		
		if (quantidadeDigitos <= 16 && quantidadeDigitos >= 15) {
			// chama a classe lunh e realiza o calculo retorna true or false
			if(Luhn.checkValidade(segura)) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Validado: "+numeroCartao;
	}
	
	@SuppressWarnings("unused")
	private void calcInicioCartao() {
		
		// passa de big integer para sdtring
        String numeroCartaoString = numeroCartao.abs().toString();

        // quatro primeiros
        String quatroPrimeirosDigitosStr = numeroCartaoString.substring(0, 4);
        quatroPrimeirosDigitos = Integer.parseInt(quatroPrimeirosDigitosStr);

        // três primeiros
        String tresPrimeirosDigitosStr = numeroCartaoString.substring(0, 3);
        tresPrimeirosDigitos = Integer.parseInt(tresPrimeirosDigitosStr);

        // dois primeiros
        String doisPrimeirosDigitosStr = numeroCartaoString.substring(0, 2);
        doisPrimeirosDigitos = Integer.parseInt(doisPrimeirosDigitosStr);

        // primeiro
        char primeiroDigitoChar = numeroCartaoString.charAt(0);
        primeiroDigito = Character.getNumericValue(primeiroDigitoChar);
	}
	
}
