package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Time implements Iterable<Jogador>{

    private List<Jogador> jogadors = new ArrayList<Jogador>();

    public Time(Jogador... jogadors) {
        this.jogadors = Arrays.asList(jogadors);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return jogadors.iterator();
    }

}


