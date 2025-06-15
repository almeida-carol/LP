import java.util.Scanner;

public class MaquinaCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$ 0,50");
        System.out.println("    2. Café Longo R$ 1,00");
        System.out.println("    3. Capuccino R$ 2,50");
        System.out.println("    4. Chocolate R$ 2,00");
        System.out.println("------------------------------");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        double preco = 0;
        String bebida = "";

        switch (opcao) {
            case 1:
                bebida = "Café Expresso";
                preco = 0.50;
                break;
            case 2:
                bebida = "Café Longo";
                preco =
