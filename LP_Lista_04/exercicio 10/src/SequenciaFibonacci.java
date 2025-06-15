import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o número de termos da sequência de Fibonacci: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Digite um número inteiro positivo maior que zero.");
        } else {
            System.out.println("Sequência de Fibonacci com " + n + " termo(s):");

            int primeiro = 0, segundo = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(primeiro + " ");

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }

            System.out.println();
        }

    }
}
