package at4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo("Porshe", "911", "2023", 10000);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(carro);

        System.out.println(json);
        
	}

}
