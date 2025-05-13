import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma nota");
        double N1 = leitor.nextDouble();

        System.out.println("Digite uma nota");
        double N2 = leitor.nextDouble();

        double soma = N1 + N2;

        double media = soma / 2;

        System.out.println("Média: " + media);
    }
}