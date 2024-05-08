package at2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class APICripito {
	
	private static final String base_URL = "https://api.bitpreco.com/";
	private static final String fim_URL = "-brl/ticker";
    
    public Cripto busca(String cripto) throws IOException, InterruptedException { 
        
        String endereco = base_URL + cripto + fim_URL;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());        

        return new Gson().fromJson(response.body(), Cripto.class);
        
    }

}
