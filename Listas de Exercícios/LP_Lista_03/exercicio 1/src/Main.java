import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número real");
        double numeroreal = leitor.nextDouble();

        if (numeroreal > 0){
            double raiz = Math.sqrt(numeroreal);
            System.out.println("A raiz quadrada é: " + raiz);


        }
        else{
            System.out.println("Valor inválido!");
        }
    }
}

