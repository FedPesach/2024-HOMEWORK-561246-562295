package it.uniroma3.diadia.giocatore;
public class Giocatore {
	
	private int cfu ;
	private Borsa borsa;
	
	public Giocatore() {
		this.cfu = 20; //inziali
		this.borsa = new Borsa();
	}
	
	public int getcfu() {
		return cfu;
	}
	
	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
	public Borsa getBorsa() {
		return borsa;
	}
	
	public void setBorsa (Borsa borsa) {
		this.borsa = borsa;
	}
	

}
