/*

Claro! O desafio proposto no curso "Java: aplicando a Orientação a Objetos" consistia em 
criar uma aplicação relacionada a músicas, na qual fosse possível escutar áudios. Para isso,
os alunos deveriam criar uma superclasse chamada "Áudio" e implementar heranças, como "Podcasts"
e "Músicas", explorando o conceito de encapsulamento.

A proposta era modelar a aplicação de forma que existisse uma classe "Áudio" com atributos como título,
duração, total de reproduções, curtidas e classificação. Além disso, os alunos foram desafiados a pensar
nos métodos encapsulados para curtir, reproduzir e outras funcionalidades, com o intuito de impedir que
a classe Principal tivesse acesso direto a esses atributos.

Esse projeto proporcionou aos alunos uma compreensão mais aprofundada dos conceitos de orientação a objetos
e a oportunidade de aplicar esses conhecimentos na criação de uma aplicação prática relacionada a músicas.
Através da exploração de herança, polimorfismo e encapsulamento, os alunos puderam desenvolver suas habilidades
de programação orientada a objetos e se preparar para trabalhar com Java ou outras linguagens semelhantes.

*/

package com.spotlura;

import com.spotlura.util.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
	
		do {
			
			System.out.println("Bem vindo ao SpotLura !!\n"
	                + "1 - escutar Podcasts\n"
	                + "2 - escutar Musicas");
			
			int opcao = Integer.parseInt(scanner.nextLine());
			
			if(opcao == 1) {
				System.out.println("Nome do podcast ? \n");
				String nomeMusica = scanner.nextLine();
				System.out.println("Nome do(a) caster ? \n");
				String nomeCaster= scanner.nextLine();
				Reproduzivel pd = new Podcasts(nomeMusica, 130.30,nomeCaster);
				
				pd.reproduzir();
				pd.curtir();
				pd.reproduzir();
				pd.curtir();
				pd.reproduzir();
				pd.curtir();
				pd.reproduzir();
				pd.curtir();
				pd.reproduzir();
				pd.curtir();
				pd.classificar();
				pd.exibirInformacoes();
				
				break;
				
			}else if(opcao == 2){
				System.out.println("Nome da musica ? \n");
				String nomePodcast = scanner.nextLine();
				System.out.println("Nome da banda/cantor ?\n");
				String  nomeArtista = scanner.nextLine();
				Reproduzivel  ms = new Musicas (nomePodcast, 2.20, nomeArtista);
				
				ms.reproduzir();
				ms.curtir();
				ms.reproduzir();
				ms.curtir();
				ms.reproduzir();
				ms.curtir();
				ms.classificar();
				ms.exibirInformacoes();
				
				break;
				
			}
			
			else {
				System.out.println("Erro forneca uma opcao valida !!");
			}
			
		}while (a != 4);
		
		scanner.close();
		
	}

}
