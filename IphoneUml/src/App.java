
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Iphone iphone1 = new Iphone();
        int opcao;

        do {
            System.out.println("\nSeja bem-vindo ao Iphone 1");
            System.out.println("Escolha o Aplicativo que deseja Executar:");
            System.out.println("Opção 1: Reprodutor Musical");
            System.out.println("Opção 2: Aplicativo de Telefone");
            System.out.println("Opção 3: Navegador");
            System.out.println("Opção 0: Desligar o Celular");
            System.out.println("Digite: ");
            opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("O celular foi desligado.");
                System.exit(0);
            } else if (opcao > 0 & opcao <= 3) {
                iphone1.escolhDeApps(opcao);
            } else {
                System.out.println("Aplicativo não instalado, tente novametne com algum app disponível");
            }
        } while (opcao != 0);
        input.close();
    }
}
