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
            System.out.println("Débito selecionado, desconto de 5% aplicado");
            System.out.println("Valor final: " + valorcompra);
        }

        else if(formapagamento == 2){
            
        }

        else if(formapagamento == 3){
            double desconto2 = valorcompra * 0.10;
            System.out.println("Pix selecionado, desconto de 10% aplicado");
            System.out.println("Valor final: " + desconto2);
        }
        else{
            System.out.println("Opção inválida");
        }




        }

        }

