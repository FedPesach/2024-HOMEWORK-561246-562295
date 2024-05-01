package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Test;


public class FabbricaDiComandiFisarmonicaTest {
    private FabbricaDiComandiFisarmonica fabbrica = new FabbricaDiComandiFisarmonica();

 
    
    
    @Test
    public void testCostruisciComandoVai() {
        Comando comando = fabbrica.costruisciComando("vai nord");
        assertEquals(comando.getNome(),"vai");
        assertEquals(comando.getParametro(),"nord");     
    }
    
    @Test
    public void testCostruisciComandoPrendi() {
        Comando comando = fabbrica.costruisciComando("prendi martello");
        assertEquals(comando.getNome(),"prendi");
        assertEquals(comando.getParametro(),"martello");       
    }
    
    @Test
    public void testCostruisciComandoPosa() {
        Comando comando = fabbrica.costruisciComando("posa martello");
        assertEquals(comando.getNome(),"posa");
        assertEquals(comando.getParametro(),"martello");       
    }
    
    @Test
    public void testCostruisciComandoAiuto() {
        Comando comando = fabbrica.costruisciComando("aiuto");
        assertEquals(comando.getNome(),"aiuto");
        assertEquals(comando.getParametro(),null);       
    }
    
    
    @Test
    public void testCostruisciComandoGuarda() {
        Comando comando = fabbrica.costruisciComando("guarda");
        assertEquals(comando.getNome(),"guarda");
        assertEquals(comando.getParametro(),null);       
    }


}
