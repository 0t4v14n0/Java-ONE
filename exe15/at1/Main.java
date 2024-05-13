package at1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gravar = "Conteúdo a ser gravado no arquivo.";
		
		GerarArquivo gera = new GerarArquivo();
		
		try {
			gera.salvaTxt(gravar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
