import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km/h");
        double  VelocidadeKm = leitor.nextDouble();

        double velocidadeMs = VelocidadeKm / 3.6;

        System.out.println("Velocidade em M/S: " + velocidadeMs);
    }
}