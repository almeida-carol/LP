import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do cilíndro");
        double raio = leitor.nextDouble();

        System.out.println("Digite a altura do cílindro");
        double altura = leitor.nextDouble();

        double volume = Math.PI * Math.pow(raio,2)*altura;

        System.out.println("O volume do cílindro é: " + volume);
    }
}