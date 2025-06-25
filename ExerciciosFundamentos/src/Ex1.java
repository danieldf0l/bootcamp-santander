import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        var anoBase = OffsetDateTime.now().getYear();
        var input = new Scanner(System.in);
        
        System.out.println("\nDigite seu nome: ");
        var nome = input.nextLine();
        
        System.out.println("\nDigite o ano em que nasceu: ");
        var anoNascimento = input.nextInt();

        var idade = anoBase - anoNascimento;

        System.out.printf("\nOlá %s, você tem %s anos", nome, idade);
        input.close();
    }
}
