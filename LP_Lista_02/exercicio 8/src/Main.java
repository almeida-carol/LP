import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em polegadas");
        double polegadas = leitor.nextDouble();

        double milimetros = polegadas * 25.4;

        System.out.println("Medida em milimetros: " + milimetros);

    }
}