import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = in.nextInt();

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de número negativo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }

    }
}
