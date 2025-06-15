import java.util.Scanner;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, menor, posMaior, posMenor;


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
        }

        maior = vetor[0];
        menor = vetor[0];
        posMaior = 0;
        posMenor = 0;


        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("O maior número é " + maior + " e está na posição " + posMaior);
        System.out.println("O menor número é " + menor + " e está na posição " + posMenor);

        scanner.close();
    }
}