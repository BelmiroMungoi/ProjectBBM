import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do rectângulo:");
        double largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do rectângulo:");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;
        double perimetro = 2 * (largura + comprimento);

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);

        scanner.close();
    }
}
