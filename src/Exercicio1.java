import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = lerDados.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = lerDados.nextInt();

        System.out.println("===== Inicio das Operações =====");
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Divisão: " + ((float) num1 / num2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        System.out.println("==== Fim das Operações ====");
        lerDados.close();

    }
}
