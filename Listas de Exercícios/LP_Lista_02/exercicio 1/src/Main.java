import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int NI = leitor.nextInt();

        int dobro = NI * 2;

        System.out.println("Dobro: " + dobro);
    }
}