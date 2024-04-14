import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.main.Partita;

	
	
public class PartitaTest {
		private Labirinto labirinto;
		private Partita partita;
		private Stanza stanzaCorrente;
		private Stanza stanzaVincente;
		
		@Before
		public void setUp() {
			
			partita = new Partita(labirinto);
			stanzaCorrente = new Stanza("Atrio");
			stanzaVincente = new Stanza("Biblioteca");
		}
		
		@Test
		public void setStanzaCorrenteTest() {
			partita.setStanzaCorrente(stanzaCorrente);
			assertEquals(stanzaCorrente, partita.getStanzaCorrente());
		}
		
		@Test
		public void vintaTest() {
			partita.setStanzaCorrente(stanzaVincente);
			assertTrue(partita.vinta());
		}
		
		@Test
		public void isFinitaTest() {
			partita.setFinita();
			assertTrue(partita.isFinita());
		}
		
	}