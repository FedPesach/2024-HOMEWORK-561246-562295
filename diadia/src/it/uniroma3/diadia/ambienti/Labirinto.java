package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.main.Partita;

/**
* Classe Labirinto - ha la responsabilità di creare il labirinto, di memorizzare la
	stanza iniziale (entrata) e quella finale (uscita)
	– aggiungere un riferimento ad un'istanza di Labirinto nella
	classe Partita (che ovviamente dovrà essere liberata dalle
		responsabilità spostate nella nuova classe)
*
* @author Omar Federico
* @see Stanza
* @version base
*/
public class Labirinto {
	
	private Stanza stanzaIniziale;
	private Stanza stanzaFinale;
	private Partita partita;
	private final String MESSAGGIO_BENVENUTO =
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
public Labirinto(){
	this.partita = partita;
	this.creaStanze();
}
private void creaStanze() {
	/* crea gli attrezzi */
		Attrezzo lanterna = new Attrezzo("lanterna",3);
	Attrezzo osso = new Attrezzo("osso",1);
	
	/* crea stanze del labirinto */
	Stanza atrio = new Stanza("Atrio");
	Stanza aulaN11 = new Stanza("Aula N11");
	Stanza aulaN10 = new Stanza("Aula N10");
	Stanza laboratorio = new Stanza("Laboratorio Campus");
	Stanza biblioteca = new Stanza("Biblioteca");
	
	/* collega le stanze */
	atrio.impostaStanzaAdiacente("nord", biblioteca);
	atrio.impostaStanzaAdiacente("est", aulaN11);
	atrio.impostaStanzaAdiacente("sud", aulaN10);
	atrio.impostaStanzaAdiacente("ovest", laboratorio);
	aulaN11.impostaStanzaAdiacente("est", laboratorio);
	aulaN11.impostaStanzaAdiacente("ovest", atrio);
	aulaN10.impostaStanzaAdiacente("nord", atrio);
	aulaN10.impostaStanzaAdiacente("est", aulaN11);
	aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
	laboratorio.impostaStanzaAdiacente("est", atrio);
	laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
	biblioteca.impostaStanzaAdiacente("sud", atrio);
   /* pone gli attrezzi nelle stanze */
	aulaN10.addAttrezzo(lanterna);
	atrio.addAttrezzo(osso);
	//aulaN11.addAttrezzo(osso);
	// il gioco comincia nell'atrio
       stanzaIniziale = atrio; 
	stanzaFinale = biblioteca;
	}
public Stanza getStanzaFinale() {
	return stanzaFinale;
}

public void setStanzaIniziale(Stanza stanzaIniziale) {
	this.stanzaIniziale = stanzaIniziale;
}

public Stanza getStanzaIniziale() {
	return this.stanzaIniziale;
}
	}


