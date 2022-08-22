package domian.jogador;

public interface InterJogador {

    boolean verificarCondicoesDeJogo();
    String aplicarCartaoAmarelo(int cartaoAmarelo);
    String  aplicarCartaoVermelho(int cartaoVermelho);
    String cumprirSuspencao();
    String sofrerlesao();
    String executarTreinamento();

}
