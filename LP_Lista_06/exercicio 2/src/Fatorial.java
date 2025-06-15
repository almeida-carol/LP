import java.util.Scanner;

public class Fatorial {

    public static long calcularFatorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não é definido para números negativos");
        }

        if (n == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Digite um número inteiro não-negativo N: ");
        int n = in.nextInt();

        try {

            long resultado = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}