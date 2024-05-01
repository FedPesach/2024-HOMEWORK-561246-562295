package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;

	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;

	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}

	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new Attrezzo[10]; // speriamo bastino...
		this.numeroAttrezzi = 0;
	}

	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		if (this.numeroAttrezzi==10)
			return false;
		for (int i= 0; i<this.attrezzi.length; i++) {
			if(this.attrezzi[i]==null) {
				attrezzi[i]=attrezzo;
				this.numeroAttrezzi++;
				break;
			}
		}
		return true;
	}
	public int getPesoMax() {
		return pesoMax;
	}
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.attrezzi.length; i++) {
			if (this.attrezzi[i]!=null&&this.attrezzi[i].getNome().equals(nomeAttrezzo)) {
				a = attrezzi[i];
				break;
			}
		}
		return a;
	}
	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.attrezzi.length; i++) {
			if(this.attrezzi[i]!=null)
				peso += this.attrezzi[i].getPeso();
		}
		return peso;
	}

	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}

	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}

	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for(int i=0;i<this.attrezzi.length;i++) {
			if(this.attrezzi[i]!=null&&this.attrezzi[i].getNome().equals(nomeAttrezzo)) {
				a=this.attrezzi[i];
				this.attrezzi[i]=null;
				this.numeroAttrezzi--;
				break;
			}
		}

		return a;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.attrezzi.length; i++) {
				if(this.attrezzi[i]!=null) {
					s.append(attrezzi[i].toString()+" ");
				}
			}
		}

		else
			s.append("Borsa vuota");
		return s.toString();
	}

	@Override
	public boolean equals(Object o) {
		Borsa that=(Borsa) o;
		if(this.numeroAttrezzi!=that.numeroAttrezzi||this.pesoMax!=that.pesoMax)return false;
		for(int i=0;i<this.attrezzi.length;i++) {
			if(this.attrezzi[i]!=that.attrezzi[i])return false;
		}
		return true; 	
	}
}
