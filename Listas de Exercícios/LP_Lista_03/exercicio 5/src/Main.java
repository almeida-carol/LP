import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double primeiranota = leitor.nextDouble();

        System.out.println("Digite a segunda nota");
        double segundanota = leitor.nextDouble();

        double media = (primeiranota + segundanota) / 2;
        System.out.println("A média é: " + media);

        if (media >= 8.5){
            System.out.println("Conceito A");
        } else if (media >= 7) {
            System.out.println("Conceito: B");
        } else if (media >= 5) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }


    }
}

