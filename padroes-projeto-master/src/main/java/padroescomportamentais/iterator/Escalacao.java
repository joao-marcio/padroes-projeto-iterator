package padroescomportamentais.iterator;

import java.util.Iterator;

public class Escalacao {

    public static Integer contarJogadoresTitularesTime(Time time) {
        int quantidade = 0;
        for (Jogador jogador : time) {
            if (jogador.isTitular()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresTime(Time time) {
        int quantidade = 0;
        for (Iterator a = time.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
