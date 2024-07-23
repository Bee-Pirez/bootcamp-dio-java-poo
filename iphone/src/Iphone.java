public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
    @Override
    public void tocar() {
        System.out.println("\uD83C\uDFB5 Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸\uFE0F Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("\uD83C\uDFB6 Música selecionada: " + musica);
    }

    //

    @Override
    public void ligar(String numero) {
        System.out.println("\uD83D\uDCDE Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("\uD83D\uDCF2 Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\uD83D\uDCEC Iniciando correio de voz...");
    }

    //

    @Override
    public void exibirPagina(String url) {
        System.out.println("\uD83C\uDF10 Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\uD83D\uDDC2\uFE0F Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\uD83D\uDD04 Página atualizada.");
    }
}
