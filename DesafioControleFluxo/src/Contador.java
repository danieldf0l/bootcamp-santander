
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nDigite o 1º número: ");
            var parametro1 = input.nextInt();
            System.out.println("Digite o 2º número: ");
            var parametro2 = input.nextInt();
            try {
                contar(parametro1, parametro2);
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo valor PRECISA ser maior que o primeiro");
            }
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        int contagem = parametro2 - parametro1;
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 0; i < contagem; i++) {
                System.out.printf("\nImprimindo o número: %s", i);
            }
        }
    }
}
