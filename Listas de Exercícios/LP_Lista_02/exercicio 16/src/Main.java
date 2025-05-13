import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do cone");
        double raio = leitor.nextDouble();

        System.out.println("Digite a altura do cone");
        double altura = leitor.nextDouble();

        double volume = (Math.PI * Math.pow(raio,2) * altura) /3;

        System.out.println("O volume do cone é: " + volume);
    }
}