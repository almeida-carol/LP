import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero inteiro");
        int numero2 = leitor.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é: "+ numero1);

        }
        else if (numero2 > numero1){
            System.out.println("O maior numero é: "+ numero2);

        }
        else{
            System.out.println("Os dois números são iguais");
        }
    }
}