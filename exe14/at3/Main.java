package at3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        try {

            System.out.println("Digite o nome do usuário do GitHub: ");
            String nome = leitura.nextLine();

            APIGithub consu = new APIGithub();

            Usuario user = consu.busca(nome);

            System.out.println(user);

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro ao consultar o usuário do GitHub: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro de entrada/saída ao consultar o usuário do GitHub: " + e.getMessage());
        }

    }

}
