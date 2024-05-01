package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVaiTest {
    private Partita partita;
    private Stanza stanzaIniziale;
    private Stanza stanzaAdiacente;
    private ComandoVai comandoVai;


    @Before
    public void setUp() {
        partita = new Partita();
        stanzaIniziale = new Stanza("Stanza iniziale");
        stanzaAdiacente = new Stanza("Stanza adiacente");
        stanzaIniziale.impostaStanzaAdiacente("nord", stanzaAdiacente);
        partita.setStanzaCorrente(stanzaIniziale);
        comandoVai = new ComandoVai("nord");
    }


    @Test
    public void testEseguiVai() {
        comandoVai.esegui(partita);
        assertEquals(stanzaAdiacente, partita.getStanzaCorrente());
    }

    @Test
    public void testEseguiSenzaDirezione() {
        ComandoVai comandoSenzaDirezione = new ComandoVai(null);
        comandoSenzaDirezione.esegui(partita);
        assertEquals(stanzaIniziale, partita.getStanzaCorrente());
    }

    @Test
    public void testEseguiDirezioneInesistente() {
        ComandoVai comandoDirezioneInesistente = new ComandoVai("sud");
        comandoDirezioneInesistente.esegui(partita);
        assertEquals(stanzaIniziale, partita.getStanzaCorrente());
    }

    @Test
    public void testCfuDecrementati() {
        int cfuIniziali = partita.getGiocatore().getCfu();
        comandoVai.esegui(partita);
        assertEquals(cfuIniziali - 1, partita.getGiocatore().getCfu());
    }
}
