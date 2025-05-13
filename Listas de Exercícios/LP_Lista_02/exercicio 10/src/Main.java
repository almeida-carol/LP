import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em milhas");
        double milhas = leitor.nextDouble();

        double quilometros = milhas * 1.60934;

        System.out.println("Medida em quilômetros: " + quilometros);
    }
}