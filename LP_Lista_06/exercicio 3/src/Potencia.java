import java.util.Scanner;

public class Potencia {

    public static long calcularPotencia(int x, int y) {

        if (y < 0) {
            throw new IllegalArgumentException("A potência y deve ser maior ou igual a zero");
        }


        if (y == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a base (x): ");
        int x = scanner.nextInt();
        System.out.print("Digite o expoente (y): ");
        int y = scanner.nextInt();

        try {

            long resultado = calcularPotencia(x, y);
            System.out.println(x + " elevado a " + y + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}