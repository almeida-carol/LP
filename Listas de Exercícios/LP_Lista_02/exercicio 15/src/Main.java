import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do cilíndro");
        double raio = leitor.nextDouble();

        System.out.println("Digite a altura do cílindro");
        double altura = leitor.nextDouble();

        double volume = Math.PI * Math.pow(raio,2)*altura;

        System.out.println("O volume do cílindro é: " + volume);
    }
}