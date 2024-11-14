package sokovnik;

import
java.util.*;

public class Main {
	public static void main(String[] args) {
		Sokovnik sokovnik = new Sokovnik();
		Random rand = new Random();
		final double verovatnocaCedjenja = 0.30;
        final double verovatnocaUbacivanja = 0.70;
        
        System.out.println("Kapacitet posude za voce je: " + PosudaZaVoce.getKapacitetPosude() + " g");
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Akcija " + (i+1) + ":");
			double akcija = rand.nextDouble();
			if(akcija < verovatnocaCedjenja && sokovnik.posuda.getVockeUPosudi().size()!=0) {
				try {
					sokovnik.proveraKapacitetaSokovnika();
			    } catch (PremasenKapacitetException e) {}
			} else {
				System.out.println("Ubacivanje voca u posudu...");
				konstruisiVocku();
			}
			System.out.println();
		}
		
		System.out.println("Ukupno iscedjeno soka: " + String.format("%.1f", sokovnik.cediljka.getUkupnoSoka()) + " g");
		
	}
	
	public static void konstruisiVocku() {
		Random rand = new Random();
		int randomIndex = rand.nextInt(VrstaVoca.values().length) + 1 ;
		VrstaVoca vrsta = VrstaVoca.izOpcije(randomIndex);
		Vocka vocka = null;
		
		switch(vrsta) {
			case JABUKA:
				vocka = new Jabuka("Jabuka", rand.nextInt(201) + 100, rand.nextDouble() < 0.2 );
				break;
		}	
		
		sokovnik.PosudaZaVoce.dodajVocku(vocka);
		sokovnik.PosudaZaVoce.prikaziStanjePosude(sokovnik.PosudaZaVoce.getVockeUPosudi());
		System.out.println("Trenutna tezina voca u posudi je: " + sokovnik.PosudaZaVoce.getTrenutnaTezinaVoca() + " g.");
		}
	}