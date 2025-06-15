import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtracao");
        System.out.println("    3. Multiplicacao");
        System.out.println("    4. Divisao");
        System.out.println("------------------------------");

        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();

        System.out.println("------------------------------");

        double resultado;
        String operador;

        if (opcao == 1) {
            resultado = num1 + num2;
            operador = "+";
        } else if (opcao == 2) {
            resultado = num1 - num2;
            operador = "-";
        } else if (opcao == 3) {
            resultado = num1 * num2;
            operador = "x";
        } else if (opcao == 4) {
            if (num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                scanner.close();
                return;
            }
            resultado = num1 / num2;
            operador = "/";
        } else {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        System.out.printf("Resultado:\n", num1, operador, num2, resultado);

        scanner.close();
    }
}
