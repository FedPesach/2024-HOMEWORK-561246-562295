package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

public class BorsaTest {

    public static void main(String[] args) {
        testAddAttrezzo();
        testRemoveAttrezzo();
    }

    private static void testAddAttrezzo() {
        Borsa borsa = new Borsa();
        Attrezzo attrezzo1 = new Attrezzo("Libro", 2);
        Attrezzo attrezzo2 = new Attrezzo("Penna", 1);
        Attrezzo attrezzo3 = new Attrezzo("Computer", 5);

        // Aggiungi un attrezzo alla borsa
        assert borsa.addAttrezzo(attrezzo1) == true : "Errore: l'attrezzo non è stato aggiunto correttamente";

        // Verifica che la borsa sia piena
        assert borsa.addAttrezzo(attrezzo2) == true : "Errore: l'attrezzo non è stato aggiunto correttamente";
        assert borsa.addAttrezzo(attrezzo3) == false : "Errore: la borsa dovrebbe essere piena";

        // Verifica che l'attrezzo sia stato aggiunto correttamente
        assert borsa.getAttrezzo("Libro") == attrezzo1 : "Errore: l'attrezzo non è stato aggiunto correttamente";
    }

    private static void testRemoveAttrezzo() {
        Borsa borsa = new Borsa();
        Attrezzo attrezzo1 = new Attrezzo("Libro", 2);
        Attrezzo attrezzo2 = new Attrezzo("Penna", 1);

        // Aggiungi attrezzi alla borsa
        borsa.addAttrezzo(attrezzo1);
        borsa.addAttrezzo(attrezzo2);

        // Rimuovi un attrezzo dalla borsa
        assert borsa.removeAttrezzo("Libro") == attrezzo1 : "Errore: l'attrezzo non è stato rimosso correttamente";

        // Verifica che la borsa non contenga più l'attrezzo rimosso
        assert borsa.getAttrezzo("Libro") == null : "Errore: l'attrezzo rimosso dovrebbe non essere più presente nella borsa";
    }
}