package at2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Titulo titulo = new Titulo("Lost",9);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(titulo);

        System.out.println(json);

	}

}
