import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int NI = leitor.nextInt();
        int quadrado = NI * NI;

        System.out.println("Raiz quadrada: " + quadrado);
    }
}