import java.util.Scanner;

   public class MaiorMenorNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = 0, menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = in.nextInt();

            if (i == 1) {

                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("\nMaior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

    }
}
