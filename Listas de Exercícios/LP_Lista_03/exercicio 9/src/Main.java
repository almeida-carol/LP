import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        double a = leitor.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        double b = leitor.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        double c = leitor.nextDouble();

        if ((a < b + c && a > Math.abs(b - c)) &&
                (b < a + c && b > Math.abs(a - c)) &&
                (c < a + b && c > Math.abs(a - b))) {

            System.out.println("Os lados formam um triângulo.");

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero (todos os lados iguais).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");
            }

        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

    }
}