import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em milhas");
        double milhas = leitor.nextDouble();

        double quilometros = milhas * 1.60934;

        System.out.println("Medida em quilômetros: " + quilometros);

        }
    }
