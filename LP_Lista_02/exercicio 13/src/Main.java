import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do círculo");
        double raio = leitor.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A área do circulo é: " + area);
    }
}