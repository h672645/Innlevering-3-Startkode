package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id = 0;
	private String bruker = null;
	private String dato = null;
	private int likes = 0;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		String lokalt = toString();
		String innTxt = innlegg.toString();
		boolean sjekk = lokalt.equals(innTxt);
		return sjekk;
	}
	
	@Override
	public String toString() {
		
		String utTxt = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return utTxt;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String utTxt = "<p>" + id + " " + bruker + " " + dato + " " + likes + " " + "</p>" + "\n";
		return utTxt;
	}
}
