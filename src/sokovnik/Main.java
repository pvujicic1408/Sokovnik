package sokovnik;

import
java.util.*;

public class Main {
	public static void main(String[] args) {
		final double verovatnocaCedjenja = 0.30;
        final double verovatnocaUbacivanja = 0.70;
        final int BROJ_AKCIJA_SOKOVNIKA = 100;
		
		Sokovnik sokovnik = new Sokovnik();
		Random rand = new Random();
        
        System.out.println("Kapacitet posude za voce je: " + sokovnik.getKapacitetPosude() + " g");
		
		for(int i = 0; i < BROJ_AKCIJA_SOKOVNIKA; i++) {
			System.out.println("Akcija " + (i+1) + ":");
			double akcija = rand.nextDouble();
			if(akcija < verovatnocaCedjenja && !sokovnik.proveriDaLiJePosudaPrazna()) {
				sokovnik.iscediVoceIzPosude();
			} else {
				sokovnik.ubaciVoceUPosudu();
				sokovnik.prikaziStanjeUPosudi();
				sokovnik.prikaziTrenutnuTezinuVocaUPosudi();
			}
			System.out.println();
		}
		sokovnik.getUkupnoIscedjenogSoka();	
	}
}