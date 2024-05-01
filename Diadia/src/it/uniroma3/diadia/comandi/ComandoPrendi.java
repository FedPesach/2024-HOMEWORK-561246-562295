package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class ComandoPrendi implements Comando{
	private String nomeAttrezzo;
	private IOConsole ioConsole;
	private Partita partita;

	//costruttore
	public ComandoPrendi(String attrezzo) {
		this.nomeAttrezzo=attrezzo;
	}
	
	@Override
	public void esegui(Partita partita) {
		
		if(nomeAttrezzo==null) {
			ioConsole.mostraMessaggio("quale attrezzo vuoi prendere?\n");
			return;
		}
		if(this.partita.getStanzaCorrente().hasAttrezzo(nomeAttrezzo)) {
			Attrezzo a=null;
			a=partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
			partita.getGiocatore().getBorsa().addAttrezzo(partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo));
			partita.getStanzaCorrente().removeAttrezzo(a);
			ioConsole.mostraMessaggio("l'oggetto è stato aggiunto alla borsa");
		}
		else {
			ioConsole.mostraMessaggio("l'oggetto non è presente nella stanza");
		}		
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
