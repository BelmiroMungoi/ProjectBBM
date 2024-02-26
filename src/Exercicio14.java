import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = lerDados.nextInt();
        if (idade >= 18) {
            System.out.println("Ophaa! Você é maior de idade, já podes beber!");
        } else {
            System.out.println("Ooops! Você é menor de idade");
        }
    }
}
