package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		Blogg samling = new Blogg();
		
		try {
		File fil = new File(filnavn);
		Scanner leser;
		
			leser = new Scanner(fil);
		
		int linjeNr = 1;
		String linje;
		
		
		if (leser.hasNext(TEKST)) {
			System.out.print(leser.hasNextLine());
				
		} else if (leser.hasNext(BILDE)){
			System.out.print(leser.hasNextLine());
		}
		
		
		leser.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return samling;
		
		}
}
