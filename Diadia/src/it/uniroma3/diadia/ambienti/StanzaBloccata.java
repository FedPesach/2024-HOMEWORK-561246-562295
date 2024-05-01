package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	private String direzioneBloccata;
	private String chiave;
	
	
	public StanzaBloccata(String nome, String direzioneB, String chiave) {
		super(nome);
		this.direzioneBloccata = direzioneB;
		this.chiave = chiave;
	}

	
	public boolean Bloccata() {
		return this.hasAttrezzo(chiave)==false;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzioneBloccata.equals(direzione) && this.Bloccata()==true) {
			return this;
		}
		return super.getStanzaAdiacente(direzione);
	}



}
