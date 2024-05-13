package at3;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIGithub {

    private static final String BASE_URL = "https://api.github.com/users/";

    public Usuario busca(String usuario) throws IOException, InterruptedException, ErroConsultaGitHubException {

        String endereco = BASE_URL + usuario;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404) {
            throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub: " + usuario);
        }

        return new Gson().fromJson(response.body(), Usuario.class);

    }

}
