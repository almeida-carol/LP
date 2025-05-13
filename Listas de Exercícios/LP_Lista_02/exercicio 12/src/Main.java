import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1 (peso 1)");
        double N1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 (peso 2)");
        double N2 = leitor.nextDouble();

        System.out.println("Media Ponderada");
        double media = (N1 + N2 * 2) / 3;

        System.out.println("Média: " + media);
    }
}