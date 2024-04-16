package com.spotlura.util;

public class Audio {
	
	private String titulo;
	private double duracao ;
	private  int   totalReproducoes;
	private  int   curtidas;
 	private  int   classificacao;
 	
 	public Audio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducoes = 0;
        this.curtidas = 0;
        this.classificacao = 0;
 	}

	public String getTitulo() {
 		return titulo;
 	}
 	
 	public double getDuracao() {
 		return duracao;
 	}
	
    public void reproduzir() {
        totalReproducoes++;
        System.out.println("Esta reproduzindo: "+titulo);
    }

    public void curtir() {
        curtidas++;
        System.out.println("Voce curtiu: "+titulo);
    }
    
    public int getClassificacao() {
        if (totalReproducoes >= 5) {
            return 5;
        } else if (totalReproducoes > 3) {
        	return 3;
        }else {
        	return 1;
        }
    }

    public void classificar() {
        if (totalReproducoes >= 5) {
            System.out.println("Classificação definida para: " + titulo + " - " + 5 + " estrelas");
        } else if (totalReproducoes > 3) {
            System.out.println("Classificação definida para: " + titulo + " - " + 3 + " estrelas");
        }else {
        	System.out.println("Ainda pouco avaliada...");
        }
    }

	public void exibirInformacoes(String autor) {
		System.out.println("Voce esta curtindo: " + titulo + " do(a) "+autor+" (Duração: " + duracao + " minutos) com '"+getClassificacao()+"' Estrelas");	
	}

}
