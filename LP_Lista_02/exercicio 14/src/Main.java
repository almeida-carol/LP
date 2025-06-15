import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base do triângulo retângulo");
        double base = leitor.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo");
        double altura = leitor.nextDouble();

        double area = base * altura / 2;

        System.out.println("A área do triângulo retângulo é: " + area);
    }
}