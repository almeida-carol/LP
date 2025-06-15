public class AlterarVetor {
    public static void main(String[] args) {
        int[] vetor = {3, 7, 10, 5, 8, 12, 6, 9, 4, 11};

        System.out.println("Vetor original:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // índice par
                vetor[i] += 2;
            } else { // índice ímpar
                vetor[i] *= 2;
            }
        }

        System.out.println("\nVetor alterado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
