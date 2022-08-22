package domian.jogador;

import domian.enum_posicao.Posicoes;

import java.time.LocalDate;
import java.util.*;

public class Jogador implements InterJogador, Comparable<Jogador> {

    private int numeroDaCamisa;
    private int qualidade;
    private int cartoesAmarelos;
    private int cartoesVermelhos;
    private int treinamento;

    private String nome;
    private String apelido;

    private Posicoes posicoes;

    private boolean suspenso;
    private LocalDate dataDeNascimento;

    public Jogador() {
    }

    public Jogador(String nome, String apelido, Posicoes posicoes, int numeroDaCamisa, LocalDate dataDeNascimento, boolean suspenso, int qualidade) {
        this.nome = nome;
        this.apelido = apelido;
        this.posicoes = posicoes;
        this.numeroDaCamisa = numeroDaCamisa;
        this.dataDeNascimento = dataDeNascimento;
        this.suspenso = suspenso;
        this.qualidade = qualidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public String getNome() {
        return nome;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    @Override
    public boolean verificarCondicoesDeJogo() {
        if (this.qualidade > 0) {
            if (this.getCartoesAmarelos() >= 3 || this.getCartoesVermelhos() >= 1) {
                this.setSuspenso(true);
            }
            this.setSuspenso(true);
        }
        return this.isSuspenso();
    }

    @Override
    public String aplicarCartaoAmarelo(int cartaoAmarelo) {
        this.cartoesAmarelos += cartaoAmarelo;
        return "O jogador " + this.cartoesAmarelos + " recebeu +1 cartão amarelo.\n";
    }

    @Override
    public String aplicarCartaoVermelho(int cartaoVermelho) {
        this.cartoesVermelhos += cartaoVermelho;
        return "O jogador" +this.cartoesVermelhos + " recebeu +1 cartão vermelho.\n";
    }

    @Override
    public String cumprirSuspencao() {
        this.cartoesAmarelos = 0;
        this.cartoesVermelhos = 0;
        this.verificarCondicoesDeJogo();

        return "Suspensão dos cartões do jogador " + this.getNome() + " Total de cartões: Zero\n";
    }

    @Override
    public String sofrerlesao() {
        Random random = new Random();

        int lesao = random.nextInt(5);
        int nivelDeLesao = 0;

        if (this.getQualidade() > 0) {
            switch (lesao) {
                case 0:
                    nivelDeLesao = 5;
                    break;
                case 1:
                    nivelDeLesao = 15;
                    break;
                case 2:
                    nivelDeLesao = 35;
                    break;
                case 3:
                    nivelDeLesao = 50;
                    break;
                case 4:
                    nivelDeLesao = 75;
                    break;
            }
            this.qualidade = Math.max((this.qualidade - nivelDeLesao), 0);
        }
        return "Sofreu uma lesão de " + nivelDeLesao + " porcento." +
                "A qualidade atual do jogador " + this.nome + " é de "
                + this.qualidade + "porcento.\n";
    }

    @Override
    public String executarTreinamento() {
        Random aleatorio = new Random();

        int recuperacao = aleatorio.nextInt(5);
        int nivelDeRecuperacao = 0;

        if (this.qualidade < 100) {
            switch (recuperacao) {
                case 0:
                    nivelDeRecuperacao = 5;
                    break;
                case 1:
                    nivelDeRecuperacao = 15;
                    break;
                case 2:
                    nivelDeRecuperacao = 35;
                    break;
                case 3:
                    nivelDeRecuperacao = 50;
                    break;
                case 4:
                    nivelDeRecuperacao = 75;
                    break;
            }
            this.qualidade = Math.min(this.qualidade + nivelDeRecuperacao, 100);
        }
        return "Teve um nível de recuperação de " + nivelDeRecuperacao + " porcento." +
                "A qualidade atual do jogador " + this.nome + " é de "
                + this.qualidade + " porcento.\n";
    }

    public String descricao() {
        String condicao;
        if (!this.suspenso) {
            condicao = "Apto";
        } else {
            condicao = ("Suspenso");
        }
        return this.posicoes + ": " + this.nome + " (" +
                this.apelido + ") - " + this.dataDeNascimento
                + " condições: " + condicao + '\n';
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "qualidade=" + qualidade +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Jogador jogador) {
        return this.nome.compareTo(jogador.getNome());
    }
}
