import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Equação do 2º Grau: ax² + bx + c = 0 ===");

        System.out.print("Digite o valor de a: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = leitor.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (a não pode ser zero).");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais (delta < 0).");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("A equação possui uma raiz real: x = "+ x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("A equação possui duas raízes reais: x1 " + x1, x2);
            }
        }
    }
}