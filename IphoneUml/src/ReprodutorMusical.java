
public class ReprodutorMusical {

    private boolean reproduzindo;
    private String musica;

    public void tocar() {
        if (musica == null) {
            System.out.println("Nenhuma música foi selecionada ainda");
        } else if (reproduzindo == true) {
            System.out.println("A música já está sendo tocada");
        } else {
            reproduzindo = true;
            System.out.printf("Tocando: %s", musica);
        }
    }

    public void pausar() {
        if (musica == null) {
            System.out.println("Nenhuma música foi selecionada ainda");
        } else if (reproduzindo == false) {
            System.out.println("A música já está pausada");
        } else {
            reproduzindo = false;
            System.out.printf("Pausando: %s", musica);
        }
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.printf("A música %s foi selecionada", musica);
    }

}
