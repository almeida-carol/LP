import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 1 a 7");
        int numero = leitor.nextInt();

        if(numero == 1){
            System.out.println("Segunda-Feira");

        }
        else if (numero == 2){
            System.out.println("Terça-Feira");

        }
        else if (numero == 3) {
            System.out.println("Quarta-Feira");
        }
        else if (numero == 4) {
            System.out.println("Quinta-Feira");
        }
        else if (numero == 5) {
            System.out.println("Sexta-Feira");
        }
        else if (numero == 6) {
            System.out.println("Sábado");
        }
        else if (numero == 7) {
            System.out.println("Domingo");
        }
        else{
            System.out.println("Opção inválida");
        }








        }
    }
