import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        double valorcompra = leitor.nextDouble();

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Menu: ");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Escolha a forma de pagamento: ");
        int formapagamento = leitor.nextInt();

        if(formapagamento == 1){
            double desconto = valorcompra * 0.05;
            System.out.println("Débito selecionado, desconto de 5% aplicado" + desconto);

        }

        else if (formapagamento == 2) {
            System.out.println("Digite o número de parcelas (1 a 10): ");
            int parcelas = leitor.nextInt();

            if (parcelas >= 1 && parcelas <= 4) {
                double acrescimo = valorcompra * 0.02;
                double valorfinal = valorcompra + acrescimo;
                System.out.println("Crédito selecionado com até 4 parcelas, acréscimo de 2% aplicado.");
                System.out.printf("Total: R$ %.2f em %d parcelas de R$ %.2f\n", valorfinal, parcelas, valorfinal / parcelas);
            } else if (parcelas >= 5 && parcelas <= 10) {
                double acrescimo = valorcompra * 0.05;
                double valorfinal = valorcompra + acrescimo;
                System.out.println("Crédito selecionado com mais de 4 parcelas, acréscimo de 5% aplicado.");
                System.out.printf("Total: R$ %.2f em %d parcelas de R$ %.2f\n", valorfinal, parcelas, valorfinal / parcelas);
            } else {
                System.out.println("Número de parcelas inválido. Deve ser entre 1 e 10.");
            }

        }
        else if(formapagamento == 3){
            double desconto2 = valorcompra * 0.10;

            System.out.println("Pix selecionado, desconto de 10% aplicado" + desconto2);

        }
        else{
            System.out.println("Opção inválida");
        }
    }
}