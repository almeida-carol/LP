import java.util.Scanner;

public class Palindromo {

    public static boolean isPalindromo(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = str.length() - 1;

        while (esquerda < direita) {
            if (str.charAt(esquerda) != str.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = in.nextLine();


        if (isPalindromo(entrada)) {
            System.out.println("\"" + entrada + "\" é um palíndromo!");
        } else {
            System.out.println("\"" + entrada + "\" não é um palíndromo.");
        }


    }
}