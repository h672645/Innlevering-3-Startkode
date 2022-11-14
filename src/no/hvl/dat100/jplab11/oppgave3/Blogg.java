package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innlegg;
	private int nesteLedig = 0;

	public Blogg() {
		innlegg = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innlegg = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innlegg;
	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedig; i++) {

			if(this.innlegg[i].erLik(innlegg) == true) {
				return i;
			}
		}
		
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean sjekk = false;
		
		int innleggId = innlegg.getId();
		int innleggIdTemp;
		
		for(int i = 0; i < nesteLedig; i++) {
			
			innleggIdTemp = this.innlegg[i].getId();
			if(innleggId == innleggIdTemp) {
				sjekk = true;
				return sjekk;
			}
		
		}
		
		return sjekk;
	}

	public boolean ledigPlass() {
		
		boolean sjekk = false;
		
		if(nesteLedig < innlegg.length) {
			sjekk = true;
		} else {
			sjekk = false;
		}
		
		return sjekk;
		
	}

	public boolean leggTil(Innlegg innlegg) {
		
		boolean sjekk = false;
		
		boolean plass = ledigPlass();
		boolean eksisterer = finnes(innlegg);
		if(plass == true && eksisterer == false) {
			this.innlegg[nesteLedig] = innlegg;
			nesteLedig++;
			sjekk = true;
		} else {
			sjekk = false;
		}
		return sjekk;
		
	}

	public String toString() {
		String[] innleggTabell = new String[nesteLedig];
		String utTxt = nesteLedig + "\n";
		
		for(int i = 0; i < nesteLedig; i++) {
			
			innleggTabell[i] =  innlegg[i] + "\n";
			
		}
		for(int i = 0; i < innleggTabell.length; i++){
			utTxt += "" + innleggTabell[i].toString();
		}
		
		
		return utTxt;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {

		Innlegg[] temp1 = innlegg;
		Innlegg[] temp2 = new Innlegg[innlegg.length*2];
		for(int i = 0; i < nesteLedig; i++) {
			temp2[i] = temp1[i];
		}
		this.innlegg = temp2;
		
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		if(nesteLedig == this.innlegg.length-1) {
			utvid();
		}
		
		if(finnes(innlegg) == false && ledigPlass() == true){
			
			this.innlegg[nesteLedig] = innlegg;
			return true;
			
		}
		
		return false;
	}

	public boolean slett(Innlegg innlegg) {

		int plass = finnInnlegg(innlegg);
		
		if(plass >=0) {
			nesteLedig--;
			this.innlegg[plass] = this.innlegg[nesteLedig];
				
			this.innlegg[nesteLedig] = null;
			return true;
		} else {
			return false;
		}
		
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}