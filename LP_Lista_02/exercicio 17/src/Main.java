import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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