package at1;

import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivo {
	
	public void salvaTxt(String gravar) throws IOException {
		
		FileWriter escrita = new FileWriter("arquivo.txt");
		escrita.write(gravar);
		escrita.close();
	}

}