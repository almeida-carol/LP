import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double total = 0;

        System.out.println("Digite o primeiro número");
        double N1 = leitor.nextDouble();

        System.out.println("Digite o segundo número");
        double N2 = leitor.nextDouble();

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Menu");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Escolha uma opção");
        int opcao = leitor.nextInt();

        System.out.println("----------------------------------------------------------------------------");

        if (opcao == 1) {
            total = N1 + N2;
            System.out.println("O total é: " + total);
        } else if (opcao == 2) {
            total = N1 - N2;
            System.out.println("O total é " + total);
        } else if (opcao == 3) {
            total = N1 * N2;
            System.out.println("O total é " + total);
        } else if (opcao == 4) {
            total = N1 / N2;
            System.out.println("O total é " + total);
        } else {
            System.out.println("Opção inválida");
        }
    }
}