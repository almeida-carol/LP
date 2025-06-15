import java.util.Scanner;

public class SomaNumeros {

    public static int somaAteN(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = in.nextInt();

        try {

            int resultado = somaAteN(n);
            System.out.println("A soma de 1 até " + n + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}