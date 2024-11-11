package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	public static final double KAPACITET_POSUDE=3000;
	static int trenutnaTezinaVoca = 0;
	static private List<Vocka> vockeUPosudi;
	
	public PosudaZaVoce() {
		vockeUPosudi = new ArrayList();
	}
	
	public static void dodajVocku(Vocka vocka) throws PremasenKapacitetException {
		if(trenutnaTezinaVoca + vocka.getTezinaVocke() > KAPACITET_POSUDE) {
			throw new PremasenKapacitetException("Kapacitet posude za voce je premasen!");
		}
		if(!vocka.getIsTrula()) {
			vockeUPosudi.add(vocka);
			trenutnaTezinaVoca += vocka.getTezinaVocke();
			System.out.println("Ubacena vocka: " + vocka.getNazivVocke() + " "  + vocka.getTezinaVocke() + " g");
		}else {
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
	
	public static void isprazniPosudu() {
		vockeUPosudi.clear();
		trenutnaTezinaVoca = 0;
	}

}
