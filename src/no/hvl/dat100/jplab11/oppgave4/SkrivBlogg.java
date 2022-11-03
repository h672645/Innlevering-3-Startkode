package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) throws Exception {

		PrintWriter skriver = new PrintWriter(filnavn, mappe);
		
		try{
			skriver.print(samling.toString());
			
			skriver.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		

		return true;

	}
}
