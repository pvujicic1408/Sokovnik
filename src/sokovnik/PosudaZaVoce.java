package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	private final int MINIMALNI_KAPACITET = 2000;
	private final int MAKSIMALNI_KAPACITET = 5000;

	Random rand = new Random();
	private int kapacitet = MINIMALNI_KAPACITET + rand.nextInt(MAKSIMALNI_KAPACITET - MINIMALNI_KAPACITET);
	private int trenutnaTezinaVoca = 0;
	private List<Vocka> vockeUPosudi = new ArrayList<>();
	
	public void dodajVocku(Vocka vocka) {
		 if(trenutnaTezinaVoca + vocka.getTezina() > kapacitet) {
			 System.out.println("Nema mesta za vocku: " + vocka.getNaziv() + " tezine " + vocka.getTezina() + " g. Sledeca akcija...");
		 } else if(!vocka.getTrula()) {
			vockeUPosudi.add(vocka);
			trenutnaTezinaVoca += vocka.getTezina();
			System.out.println("Ubacena vocka: " + vocka.getNaziv() + " "  + vocka.getTezina() + " g");
		 } else {
			System.out.println("Trule vocke se ne mogu ubaciti u posudu!");
		 }
	}
		 
	
	public void prikaziStanjePosude(List<Vocka> vocke) {
		System.out.println("Trenutno stanje u posudi: ");
		for(Vocka vocka: vocke) {
			System.out.println(vocka.getNaziv() + " sorte " + (vocka instanceof Jabuka ? ((Jabuka) vocka).getSorta() : "N/A") + " od " + vocka.getTezina() + " grama.");
		}
	}
	
	public List<Vocka> getVockeUPosudi() {
		return vockeUPosudi;
	}
	
	public int getTrenutnaTezinaVoca() {
		return trenutnaTezinaVoca;
	}
	
	public int getKapacitetPosude() {
		return kapacitet;
	}
	
	public void isprazniPosudu() {
		vockeUPosudi.clear();
		trenutnaTezinaVoca = 0;
	}

}
