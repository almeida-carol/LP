import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = leitor.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.printf("Ordem crescente:"+ menor, meio, maior);

    }
}