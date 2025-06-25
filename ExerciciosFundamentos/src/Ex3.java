import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);

        System.out.println("\nQual o lado A do retângulo? ");
        var ladoA = input.nextInt();
        System.out.println("Qual o lado B do retângulo? ");
        var ladoB = input.nextInt();
        System.out.println("A área do retângulo é: " + ladoA*ladoB);
        input.close();
    }
}
