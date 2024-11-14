package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	private static int kapacitetPosude;
	private static int trenutnaTezinaVoca = 0;
	private static List<Vocka> vockeUPosudi;
	Random rand;
	
	public PosudaZaVoce() {
		rand = new Random();
		vockeUPosudi = new ArrayList();
		kapacitetPosude = 2000 + rand.nextInt(3000); 
	}
	
	public static void dodajVocku(Vocka vocka) {
		 if(trenutnaTezinaVoca + vocka.getTezinaVocke() > kapacitetPosude) {
			 System.out.println("Nema mesta za vocku: " + vocka.getNazivVocke() + " tezine " + vocka.getTezinaVocke() + " g. Sledeca akcija...");
		 } else if(!vocka.getIsTrula()) {
			vockeUPosudi.add(vocka);
			trenutnaTezinaVoca += vocka.getTezinaVocke();
			System.out.println("Ubacena vocka: " + vocka.getNazivVocke() + " "  + vocka.getTezinaVocke() + " g");
		 } else {
			System.out.println("Trule vocke se ne mogu ubaciti u posudu!");
		 }
	}
		 
	
	public static void prikaziStanjePosude(List<Vocka> vocke) {
		System.out.println("Trenutno stanje u posudi: ");
		for(Vocka vocka: vocke) {
			System.out.println(vocka.getNazivVocke() + " sorte " + (vocka instanceof Jabuka ? ((Jabuka) vocka).getSorta() : "N/A") + " od " + vocka.getTezinaVocke() + " grama.");
		}
		
	}
	
	public static List<Vocka> getVockeUPosudi() {
		return vockeUPosudi;
	}
	
	public static int getTrenutnaTezinaVoca() {
		return trenutnaTezinaVoca;
	}
	
	public static int getKapacitetPosude() {
		return kapacitetPosude;
	}
	
	public static void isprazniPosudu() {
		vockeUPosudi.clear();
		trenutnaTezinaVoca = 0;
	}

}
