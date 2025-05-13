import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira raiz: ");
        double x1 = leitor.nextDouble();

        System.out.print("Digite a segunda raiz: ");
        double x2 = leitor.nextDouble();

        double a = 1;
        double b = -a * (x1 + x2);
        double c = a * (x1 * x2);

        System.out.printf("A equação do segundo grau é: %.0fx² + %.0fx + %.0f = 0%n", a, b, c);

    }
}

