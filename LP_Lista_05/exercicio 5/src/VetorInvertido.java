public class VetorInvertido {
    public static void main(String[] args) {

        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] v2 = new int[10];


        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.print("Vetor original (v1): ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor invertido (v2): ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();
    }
}