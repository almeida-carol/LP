import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Menu - Caixa Eletrônico:");
        System.out.println("5. Ver saldo");
        System.out.println("6. Saque");
        System.out.println("7. Depósito");
        System.out.println("8. Transferência");
        System.out.println("9. Sair");
        System.out.println("--------------------------");

        System.out.print("Escolha uma opção entre 5 e 9: ");
        int opcao = leitor.nextInt();
        System.out.println("--------------------------");

        switch (opcao) {
            case 5:
                System.out.println("5. Ver saldo");
                break;
            case 6:
                System.out.println("6. Saque");
                break;
            case 7:
                System.out.println("7. Depósito");
                break;
            case 8:
                System.out.println("8. Transferir");
                break;
            case 9:
                System.out.println("9. Sair");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
    }


