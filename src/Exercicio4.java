import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólar: ");
        double dolares = scanner.nextDouble();

        double meticais = dolares * 63.50;

        System.out.println("O valor em meticais é de: " + meticais + " MZN");

        scanner.close();
    }
}
