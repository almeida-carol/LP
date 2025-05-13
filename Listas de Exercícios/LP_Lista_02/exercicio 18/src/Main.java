import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = leitor.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("A solução da equação é: x = " + x);
        } else {
            if (b == 0) {
                System.out.println("A equação possui infinitas soluções.");
            } else {
                System.out.println("A equação não possui solução.");
            }
        }

    }
}