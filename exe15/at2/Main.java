package at2;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
		Titulo titulo = new Titulo("Lost",9);
		
        Gson gson = new Gson();

        String json = gson.toJson(titulo);

        System.out.println(json);

	}

}
