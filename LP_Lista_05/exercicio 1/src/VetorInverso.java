public class VetorInverso {
    public static void main(String[] args) {

        int[] vetor = {5, 12, 7, 9, 21, 3, 14, 8, 10, 6};

        System.out.println("Vetor na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
