import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma velocidade em M/S");
        double MS = leitor.nextDouble();

        double KM = MS * 3.6;

        System.out.println("velocidade em KM/H: " + KM);
    }
}