import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
