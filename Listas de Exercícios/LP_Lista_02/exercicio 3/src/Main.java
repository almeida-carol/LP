import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número real");
        int NR = leitor.nextInt();

        double quintaparte = NR / 5;

        System.out.println("Quinta parte: " + quintaparte);
    }
}