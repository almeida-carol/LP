import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1 (peso 1)");
        double N1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 (peso 2)");
        double N2 = leitor.nextDouble();

        System.out.println("Media Ponderada");
        double media = (N1 + N2 * 2) / 3;

        System.out.println("Média: " + media);
    }
}