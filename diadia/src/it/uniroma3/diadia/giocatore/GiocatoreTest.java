package it.uniroma3.diadia.giocatore;

public class GiocatoreTest {

    public static void main(String[] args) {
        testCfu();
        testBorsa();
    }

    private static void testCfu() {
        Giocatore giocatore = new Giocatore();
        
        // Verifica il valore iniziale dei CFU
        assert giocatore.getcfu() == 20 : "Errore: i CFU iniziali non sono corretti";

        // Modifica il valore dei CFU e verifica
        giocatore.setCfu(15);
        assert giocatore.getcfu() == 15 : "Errore: i CFU non sono stati impostati correttamente";
    }

    private static void testBorsa() {
        Giocatore giocatore = new Giocatore();
        Borsa borsa = new Borsa();
        
        // Verifica che la borsa del giocatore sia inizializzata correttamente
        assert giocatore.getBorsa() != null : "Errore: la borsa non è stata inizializzata correttamente";

        // Modifica la borsa del giocatore e verifica
        giocatore.setBorsa(borsa);
        assert giocatore.getBorsa() == borsa : "Errore: la borsa del giocatore non è stata impostata correttamente";
    }
}