package domian.time;

import domian.jogador.Jogador;

import java.time.LocalDate;
import java.util.*;

public class Time implements InterTime {

    private String nome;
    private String apelido;
    private LocalDate fundacao;
    private Jogador jogador;

    public Time() { }

    public Time(String nome, String apelido, LocalDate fundacao) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public Jogador getJogador() {
        return jogador;
    }

    @Override
    public void ordenarPelaQualidade(List<Jogador> time) {
        QualidadeComparator qualidadeComparator = new QualidadeComparator();
        List<Jogador> todosOsJogadores = new ArrayList<>(time);

        todosOsJogadores.sort(qualidadeComparator);

        List<Jogador> dreamTeam = todosOsJogadores.subList(0, 7);

        dreamTeam.forEach(System.out::println);
    }

    @Override
    public void ordenarPorOrdemAlfabetica(List<Jogador> time) {

        List<Jogador> todosOsjogadores = new ArrayList<>(time);
        Collections.sort(todosOsjogadores);

        todosOsjogadores.forEach(System.out::println);
    }
}
