import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        int[] vetor = {15, 8, 23, 42, 4, 16, 9, 7, 30, 11};

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = in.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }

    }
}
