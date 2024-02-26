import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = lerDados.nextInt();
        System.out.println("A sua idade é: " + idade);
        lerDados.close();
    }
}
