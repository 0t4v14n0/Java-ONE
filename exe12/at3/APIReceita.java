package at3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class APIReceita {
	
	//https://www.themealdb.com/api/json/v1/1/search.php?s=Cookies
	
	private static final String base_URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";
    
    public Receita busca(String nome) throws IOException, InterruptedException { 
        
        String endereco = base_URL + nome;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());  
        
        System.out.println(response.body());

        return new Gson().fromJson(response.body(), Receita.class);
        
    }
    
}
