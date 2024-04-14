package it.uniroma3.diadia.attrezzi;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttrezzoTest {

    public static void main(String[] args) {
        testGetNome();
        testGetPeso();
        testToString();
    }

    private static void testGetNome() {
        Attrezzo attrezzo = new Attrezzo("Martello", 5);
        assert attrezzo.getNome().equals("Martello") : "Errore: il nome dell'attrezzo non corrisponde";
    }

    private static void testGetPeso() {
        Attrezzo attrezzo = new Attrezzo("Martello", 5);
        assert attrezzo.getPeso() == 5 : "Errore: il peso dell'attrezzo non corrisponde";
    }

    private static void testToString() {
        Attrezzo attrezzo = new Attrezzo("Martello", 5);
        assert attrezzo.toString().equals("Martello (5kg)") : "Errore: la rappresentazione stringa dell'attrezzo non è corretta";
    }
}
