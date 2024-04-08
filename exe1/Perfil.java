import java.util.Scanner;

public class Perfil {
    public static <integer> void main(String[] args) {
        //INICIA O SCAN
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e seu nome ?");
        String nome = scanner.nextLine();// Ler a linha d ebaixo

        System.out.println("Olá, " + nome + "!");
        System.out.println("Tudo bem?, vamos calcualar...");

        //tem que usar o Integer.parseInt pq o scaner sempre vai voltar uma string...

        System.out.println("Primeiro valor ?");
        int a = Integer.parseInt( scanner.nextLine());

        System.out.println("Segundo valor ?");
        int b = Integer.parseInt( scanner.nextLine());

        System.out.print("1 - soma " +
                "2- Subtracao " +
                "3- Multiplicacao " +
                "4- Divisao ");

        int ope = Integer.parseInt( scanner.nextLine());

        switch(ope){
            case 1:
                System.out.println("O resultado e: " + Calculos.soma(a,b) + "!");
                break;
            case 2:
                System.out.println("O resultado e: " + Calculos.sub(a,b) + "!");
                break;
            case 3:
                System.out.println("O resultado e: " + Calculos.mult(a,b) + "!");
                break;
            case 4:
                System.out.println("O resultado e: " + Calculos.divisao(a,b) + "!");
                break;
        }

        //TERMINA O SCANN
        scanner.close();

        Estudo.Mesagens();
    }
}
