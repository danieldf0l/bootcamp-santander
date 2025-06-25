import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        System.out.println("\nQual o tamanho do lado do quadrado? ");
        var lado = input.nextInt();
        System.out.printf("\nA área do quadrdado é: %s", lado*2);
        input.close();
    }
}
