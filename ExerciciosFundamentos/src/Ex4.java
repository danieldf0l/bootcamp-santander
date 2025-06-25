import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);

        System.out.println("\nDigite seu nome: ");
        var nome = input.nextLine();
        System.out.println("Digite a sua  idade: ");
        var idade = input.nextInt();
        input.nextLine();

        System.out.println("Digite o nome da outra pessoa: ");
        var outraNome = input.nextLine();
        System.out.println("Digite a idade da outra pessoa: ");
        var outraIdade = input.nextInt();

        System.out.printf("\nA diferença de idade entre %s e %s é de %s anos.", nome, outraNome, idade-outraIdade);

        input.close();
    }
}
