import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triângulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();
        System.out.println("--------------------------");

        if (opcao == 1) {
            System.out.print("Informe o raio do círculo: ");
            double raio = leitor.nextDouble();

            double area = Math.PI * raio * raio;
            double perimetro = 2 * Math.PI * raio;

            System.out.printf("Área = "+ area);
            System.out.printf("Perímetro = "+ perimetro);

        } else if (opcao == 2) {
            System.out.print("Informe a base: ");
            double base = leitor.nextDouble();

            System.out.print("Informe a altura: ");
            double altura = leitor.nextDouble();

            double area = (base * altura) / 2;
            double hipotenusa = Math.sqrt(base * base + altura * altura);
            double perimetro = base + altura + hipotenusa;

            System.out.printf("Área = "+ area);
            System.out.printf("Perímetro = "+ perimetro);

        } else if (opcao == 3) {
            System.out.print("Informe a largura: ");
            double largura = leitor.nextDouble();

            System.out.print("Informe a altura: ");
            double altura = leitor.nextDouble();

            double area = largura * altura;
            double perimetro = 2 * (largura + altura);

            System.out.printf("Área = "+ area);
            System.out.printf("Perímetro = "+ perimetro);

        } else {
            System.out.println("Opção inválida.");
        }

    }
}