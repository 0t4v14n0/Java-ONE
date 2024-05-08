package at1;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConsumindoAPI {
	
	private static final String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
	private static final String apiKey = "AIzaSyALXCWbJ4PJOQ96vyufDT0wkfwgdL6NJIo";
    
    public Livro busca(String livro) throws IOException, InterruptedException { 

        String termoBuscaEncoded = URLEncoder.encode(livro, StandardCharsets.UTF_8);
        
        String endereco = BASE_URL + termoBuscaEncoded + "&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());        
        
        System.out.println(response.body());

        return new Gson().fromJson(response.body(), Livro.class);
        
    }
    
}