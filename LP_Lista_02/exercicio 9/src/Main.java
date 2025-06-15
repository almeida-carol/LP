import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em quilômetros");
        double QM = leitor.nextDouble();

        double milhas = QM * 0.621371;

        System.out.println("Medida em milhas: " + milhas);

        System.out.println("Medida em");
}
}