import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial da corrida (m/s)");
        double velocidadeinicial = leitor.nextDouble();

        System.out.println("Digite a aceleração da corrida (m/s ao quadrado)");
        double aceleracao = leitor.nextDouble();

        System.out.println("Digite o tempo de percurso da corrida (s)");
        double tempo = leitor.nextDouble();

        double velocidadefinal = (velocidadeinicial + aceleracao)* tempo;
        System.out.println("A velocidade final da corrida é: "+ velocidadefinal);
    }
}