import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = lerDados.next();
        System.out.print("Digite a sua idade: ");
        int idade = lerDados.nextInt();
        System.out.println("Olá " + nome + " a sua idade é: " + idade);
        lerDados.close();
    }
}
