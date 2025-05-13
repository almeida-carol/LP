import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em milímetro");
        double milimetro = leitor.nextDouble();

        double polegadas = milimetro / 25.4;

        System.out.println("Medida em polegadas: " + polegadas);
    }
}