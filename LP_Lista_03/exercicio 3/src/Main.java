import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double troco = 0;

        System.out.println("Insira o dinheiro");
        double dinheiro = leitor.nextDouble();

        System.out.println("---------------------------------------------------------------");
        System.out.println("1. Café expresso R$0,50");
        System.out.println("2. Café longo R$1,00");
        System.out.println("3. Capuccino R$2,50");
        System.out.println("4. Chocolate R$2,00");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Escolha uma opção: ");
        double opcao = leitor.nextDouble();

        if (opcao == 1) {
            double valorexpresso = 0.50;
            troco = dinheiro - valorexpresso;
            System.out.println("Bebida selecionada: Café expresso");
            System.out.println("Seu troco: " + troco);

        } else if (opcao == 2) {
            double valorcafelongo = 1.00;
            troco = dinheiro - valorcafelongo;
            System.out.println("Bebida selecionada: Café longo");
            System.out.println("Seu troco: " + troco);

        } else if (opcao == 3) {
            double valorcapuccino = 2.50;
            troco = dinheiro - valorcapuccino;
            System.out.println("Bebida selecionada: Capuccino");
            System.out.println("Seu troco: " + troco);

        } else if (opcao == 4) {
            double valorchocolate = 2.00;
            troco = dinheiro - valorchocolate;
            System.out.println("Bebida selecionada: Chocolate");
            System.out.println("Seu troco: " + troco);
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}