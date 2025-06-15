import java.util.Scanner;

public class NumerosNaturaisEntre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = in.nextInt();

        int inicio = Math.min(num1, num2) + 1;
        int fim = Math.max(num1, num2);

        System.out.println("\nNúmeros naturais entre " + num1 + " e " + num2 + ":");

        boolean encontrou = false;
        for (int i = inicio; i < fim; i++) {
            if (i >= 0) {
                System.out.println(i);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não há números naturais entre os valores informados.");
        }

    }
}
