import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números da sequência Fibonacci:");
        int n = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;
        System.out.println("Sequência Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
