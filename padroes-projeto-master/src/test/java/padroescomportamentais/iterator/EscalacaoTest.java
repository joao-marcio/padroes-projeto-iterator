package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscalacaoTest {

    @Test
    void deveContarJogadoresTitularesTime() {
        Time time = new Time(
                new Jogador("Gabriel", true),
                new Jogador("Pedro", true),
                new Jogador("Pablo", false),
                new Jogador("Leo Pereira", true)
        );
        assertEquals(3, Escalacao.contarJogadoresTitularesTime(time));
    }

    @Test
    void deveContarTotalJogadoresTime() {
        Time time = new Time(
                new Jogador("Gabriel", true),
                new Jogador("Pedro", true),
                new Jogador("Pablo", false),
                new Jogador("Leo Pereira", true)
        );
        assertEquals(4, Escalacao.contarTotalJogadoresTime(time));
    }

}