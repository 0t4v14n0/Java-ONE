package com.cep.util;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCEP {
    
    private static final String BASE_URL = "https://viacep.com.br/ws/";
    private static final String JSON_SUFFIX = "/json/";
    
    public Cep consultarEnderecoPeloCEP(String cep) throws IOException, InterruptedException {
        String endereco = BASE_URL + cep + JSON_SUFFIX;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Cep.class);
    }
}