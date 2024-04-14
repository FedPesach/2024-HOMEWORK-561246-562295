package it.uniroma3.diadia.main;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	static final private int CFU_INIZIALI = 20;

	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private Giocatore giocatore;
	private boolean finita;
	private int cfu;
	private Labirinto labirinto;
	
	public Partita(Labirinto labirinto){
		this.giocatore = new Giocatore();
		this.labirinto = new Labirinto();
		this.stanzaVincente = labirinto.getStanzaFinale();
		this.stanzaCorrente = labirinto.getStanzaIniziale();
		this.finita = false;
		this.cfu = CFU_INIZIALI;
	}
	
	public Giocatore getGiocatore() {
		return giocatore;
	}

   
	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente().getNome().equals(this.getStanzaVincente().getNome());
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (cfu == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
	}

	
