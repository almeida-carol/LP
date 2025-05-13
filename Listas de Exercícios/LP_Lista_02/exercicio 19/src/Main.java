import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = leitor.nextDouble();

        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes reais: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Uma raiz real: x = " + x);
            } else {
                System.out.println("A equação não possui raízes reais.");
            }
        }
    }
}