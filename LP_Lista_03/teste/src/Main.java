import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número do usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se é múltiplo de 5
        if (numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 5.");
        } else {
            System.out.println(numero + " não é múltiplo de 5.");
        }

        scanner.close();
    }
}