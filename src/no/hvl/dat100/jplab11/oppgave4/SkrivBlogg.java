package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) throws Exception {

		

		try {
			File fil = new File(filnavn);
			PrintWriter skriver = new PrintWriter(fil);
			
			skriver.println(samling.toString());
			skriver.println("test test");

			skriver.close();

			return true;

		} catch (Exception e) {

			e.getStackTrace();
			return false;
		}

	}
}
