import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em quilômetros");
        double QM = leitor.nextDouble();

        double milhas = QM * 0.621371;

        System.out.println("Medida em milhas: " + milhas);

        System.out.println("Medida em");
    }
}