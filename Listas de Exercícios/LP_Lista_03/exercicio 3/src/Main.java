import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        if (media >= 50) {
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}

