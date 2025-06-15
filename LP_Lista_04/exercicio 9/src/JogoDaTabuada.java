import java.util.Scanner;
import java.util.Random;

public class JogoDaTabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jogarNovamente;

        do {
            boolean perdeu = false;

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("Quanto é " + i + " x " + j + "? ");
                    int resposta = in.nextInt();
                    int resultadoCorreto = i * j;

                    if (resposta != resultadoCorreto) {
                        System.out.println("Você errou!  O resultado era " + resultadoCorreto);
                        perdeu = true;
                        break;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns!  Você completou toda a tabuada sem errar!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = in.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Obrigado por jogar!");

    }
}
