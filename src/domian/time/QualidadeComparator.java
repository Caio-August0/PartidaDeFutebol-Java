package domian.time;

import domian.jogador.Jogador;

import java.util.Comparator;

public class QualidadeComparator implements Comparator<Jogador> {
    @Override
    public int compare(Jogador j1, Jogador j2) {
        if (j1.getQualidade() == j2.getQualidade()) {
            return 0;
        } else if (j1.getQualidade() < j2.getQualidade()) {
            return 1;
        } else {
            return -1;
        }
    }
}
