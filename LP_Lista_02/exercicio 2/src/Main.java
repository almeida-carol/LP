import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int NI = leitor.nextInt();
        int quadrado = NI * NI;

        System.out.println("Raiz quadrada: " + quadrado);

        }
    }
