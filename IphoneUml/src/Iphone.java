
import java.util.Scanner;

public class Iphone {

    public void escolhDeApps(int escolha) {
        Scanner input = new Scanner(System.in);
        int opcao;

        switch (escolha) {
            case 1 -> {
                ReprodutorMusical spotify = new ReprodutorMusical();

                do {
                    System.out.println("\nBem vindo ao Spotify");
                    System.out.println("Escolha a ação que deseja Executar:");
                    System.out.println("Opção 1: Escolher Música");
                    System.out.println("Opção 2: Tocar a música");
                    System.out.println("Opção 3: Pausar");
                    System.out.println("Opção 0: Desligar o Celular");
                    System.out.println("Digite: ");

                    opcao = input.nextInt();
                    switch (opcao) {
                        case 0:
                            System.out.println("O celular foi desligado.");
                            System.exit(0);
                        case 1:
                            input.nextLine();
                            System.out.println("Digite o nome da música desejada: ");
                            String musica = input.nextLine();
                            spotify.selecionarMusica(musica);
                            break;
                        case 2:
                            spotify.tocar();
                            break;
                        case 3:
                            spotify.pausar();
                            break;
                        default:
                            System.out.println("Função não suportada pelo aplicativo");
                            break;
                    }
                } while (opcao != 0);
            }

            case 2 -> {
                AparelhoTelefonico wpp = new AparelhoTelefonico();

                do {
                    System.out.println("\nBem vindo ao Telefone");
                    System.out.println("Escolha a ação que deseja Executar:");
                    System.out.println("Opção 1: Efetuar ligação");
                    System.out.println("Opção 2: Atender ligação");
                    System.out.println("Opção 3: Abrir correio de voz");
                    System.out.println("Opção 0: Desligar o Celular");
                    System.out.println("Digite: ");
                    opcao = input.nextInt();

                    switch (opcao) {
                        case 0:
                            System.out.println("O celular foi desligado.");
                            System.exit(0);
                        case 1:
                            input.nextLine();
                            System.out.println("Digite o número que pretende ligar: ");
                            int numeroInt = input.nextInt();
                            String numero = Integer.toString(numeroInt);
                            wpp.ligar(numero);
                            break;
                        case 2:
                            wpp.atender();
                            break;
                        case 3:
                            wpp.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Função não suportada pelo aplicativo");
                            break;
                    }
                } while (opcao != 0);
            }

            case 3 -> {
                NavegadorNaInternet chrome = new NavegadorNaInternet();

                do {
                    System.out.println("\nBem vindo ao navegador");
                    System.out.println("Escolha a ação que deseja Executar:");
                    System.out.println("Opção 1: Abrir URL");
                    System.out.println("Opção 2: Nova aba");
                    System.out.println("Opção 3: Recarregar aba");
                    System.out.println("Opção 0: Desligar o Celular");
                    System.out.println("Digite: ");

                    opcao = input.nextInt();
                    switch (opcao) {
                        case 0:
                            System.out.println("O celular foi desligado.");
                            System.exit(0);
                        case 1:
                            input.nextLine();
                            System.out.println("Digite a URL para ser acessada:");
                            String url = input.nextLine();
                            chrome.exibirPagina(url);
                            break;

                        case 2:
                            chrome.adicionarNovaAba();
                            break;
                        case 3:
                            chrome.atualizarPagina();
                            break;
                        default:
                            System.out.println("Função não suportada pelo aplicativo");
                            break;
                    }
                } while (opcao != 0);
            }

            default -> {
            }
        }
        input.close();
    }

}
