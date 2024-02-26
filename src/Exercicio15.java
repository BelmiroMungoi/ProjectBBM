import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em quilogramas:");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu Índice de Massa Corporal (IMC) é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso, precisar comer muito e puxar ferro!");
        } else if (imc < 25) {
            System.out.println("Seu peso está normal, bom trabalho!");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso, vai-la treinar pha!");
        } else {
            System.out.println("Você está obeso, hiii, ta mal isso!");
        }

        scanner.close();
    }
}
