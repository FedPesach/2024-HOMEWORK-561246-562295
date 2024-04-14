import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTestTest {
	
	private Stanza stanza;
	private Attrezzo attrezzo;
	
	@Before
	public void setUp() {
		stanza = new Stanza("StanzaTest");
		attrezzo = new Attrezzo("osso",2);
		
		
	}

	@Test
	public void AttrezzoAddtest() {
		
		assertTrue(stanza.addAttrezzo(attrezzo));
	}
	
	@Test 
	public void HasAttrezzoTest() {
		stanza.addAttrezzo(attrezzo);
		assertTrue(stanza.hasAttrezzo("osso"));
		assertFalse(stanza.hasAttrezzo("Martello"));
	}
	@Test
	public void  impostaStanzaAdiacenteTest() {
		Stanza NuovaStanza = new Stanza("AltraStanza");
		stanza.impostaStanzaAdiacente("nord", NuovaStanza);
		assertEquals(NuovaStanza,stanza.getStanzaAdiacente("nord"));
	}

}
