
public class NavegadorNaInternet {

    private String url;

    public void adicionarNovaAba() {
        System.out.println("Nova aba vazia iniciada");
    }

    public void atualizarPagina() {
        if (url == null) {
            System.out.println("Uma aba vazia não pode ser recarregada");
        } else {
            System.out.println("Página recarregada com sucesso!");
        }

    }

    public void exibirPagina(String url) {
        this.url = url;
        System.out.printf("A página %s foi carregada", url);
    }
}
