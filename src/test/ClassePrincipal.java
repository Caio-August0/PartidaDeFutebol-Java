package test;

import domian.jogador.Jogador;
import domian.enum_posicao.Posicoes;
import domian.time.Time;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassePrincipal {
    public static void main(String[] args) {

        Jogador jogador[] = new Jogador[15];

        jogador[0] = new Jogador("Caio Augusto", "Caizin",
                Posicoes.GOLEIRO, 1, LocalDate.of(2004,
                Month.JUNE, 1), false, 100);

        jogador[1] = new Jogador("Diego Augusto", "Diego A.",
                Posicoes.GOLEIRO, 1, LocalDate.of(1999,
                Month.JANUARY, 23), false, 8);

        jogador[2] = new Jogador("Gabriel Luis", "Gabreil L.",
                Posicoes.ZAGUEIRO, 23, LocalDate.of(1890,
                Month.APRIL, 30), false, 98);

        jogador[3] = new Jogador("Matheus", "Matheuzinho",
                Posicoes.LATERAL_DIREITO, 34, LocalDate.of(1990,
                Month.DECEMBER, 17), false, 88);

        jogador[4] = new Jogador("Felipe Luís", "Felipe L.",
                Posicoes.LATERAL_ESQUERDO, 16, LocalDate.of(2000,
                Month.JUNE, 1), false, 95);

        jogador[5] = new Jogador("João Gomes", "João G.",
                Posicoes.VOLANTE, 35, LocalDate.of(1995,
                Month.MAY, 3), false, 90);

        jogador[6] = new Jogador("Giorgian de Arrascaeta", "Arrascaeta",
                Posicoes.MEIA, 9, LocalDate.of(1991,
                Month.NOVEMBER, 6), false, 80);

        jogador[7] = new Jogador("Gabriel", "Grabigol",
                Posicoes.ATACANTE, 10, LocalDate.of(2001,
                Month.AUGUST, 18), false, 99);

        jogador[8] = new Jogador("Julio Cesar", "Neymar J.",
                Posicoes.GOLEIRO, 18, LocalDate.of(1997,
                Month.JULY, 13), false, 99);

        jogador[9] = new Jogador("Thiago Silva", "Thiago S.",
                Posicoes.ZAGUEIRO, 3, LocalDate.of(1890,
                Month.APRIL, 30), false, 97);

        jogador[10] = new Jogador("Douglas Costa", "Douglas C.",
                Posicoes.LATERAL_DIREITO, 4, LocalDate.of(1996,
                Month.DECEMBER, 19), false, 88);

        jogador[11] = new Jogador("Philippe Coutinho", "Coutinho",
                Posicoes.LATERAL_ESQUERDO, 25, LocalDate.of(1900,
                Month.JUNE, 1), false, 75);

        jogador[12] = new Jogador("Roberto Firmino", "Firmino",
                Posicoes.VOLANTE, 35, LocalDate.of(1992,
                Month.MAY, 31), false, 90);

        jogador[13] = new Jogador("Giorgian de Arrascaeta", "Arrascaeta",
                Posicoes.MEIA, 9, LocalDate.of(1991,
                Month.NOVEMBER, 6), false, 80);

        jogador[14] = new Jogador("Neymar Junior", "Neymar J.",
                Posicoes.ATACANTE, 11, LocalDate.of(1991,
                Month.AUGUST, 18), false, 100);

        //---------------------------------------------------------------------------------------

        Time t1 = new Time("Flamengo", "Malvadão",
                LocalDate.of(1895, Month.NOVEMBER, 17));

        Time t2 = new Time("Palmeiras", "Porcão",
                LocalDate.of(1914, Month.AUGUST, 26));

        //---------------------------------------------------------------------------------------

        List<Jogador> time1 = new ArrayList<>(Arrays.asList(jogador[0], jogador[1], jogador[2],
                jogador[3],jogador[4], jogador[5], jogador[6], jogador[7], jogador[8], jogador[9],
                jogador[10], jogador[11], jogador[12], jogador[13], jogador[14]));

        //t1.ordenarPelaQualidade(time1);
        t1.ordenarPorOrdemAlfabetica(time1);


    }
}
