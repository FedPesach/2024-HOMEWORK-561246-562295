package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{
	private String attrezzoLuminoso;
	
	
	public StanzaBuia(String nome, String AttrezzoLuminoso) {
		super(nome);
		this.attrezzoLuminoso = AttrezzoLuminoso;
	}
	
	public String getDescrizione() {
		if(super.getAttrezzi().length==0) return "la stanza e' vuota";
		if(super.hasAttrezzo(attrezzoLuminoso)==false) {
			this.IsBuia();
		}
		return this.toString();
	}	
	
	public void IsBuia() {
		
			System.out.println("qui c'e'un buio pesto"); 
		
	}

}

