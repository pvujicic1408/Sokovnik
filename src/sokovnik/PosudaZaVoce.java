package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	private final int MINIMALNI_KAPACITET_U_GRAMIMA = 2000;
	private final int MAKSIMALNI_KAPACITET_U_GRAMIMA = 5000;
	
	private Random rand = new Random();
	private int kapacitet = MINIMALNI_KAPACITET_U_GRAMIMA + rand.nextInt(MAKSIMALNI_KAPACITET_U_GRAMIMA - MINIMALNI_KAPACITET_U_GRAMIMA);
	private int trenutnaTezinaVoca = 0;
	private List<Vocka> vockeUPosudi = new ArrayList<>();
	
	public void dodajVocku(Vocka vocka, int kapacitetSokovnika) throws PremasenKapacitetException {
		System.out.println("Ubacivanje voca u posudu...");
		 if(trenutnaTezinaVoca + vocka.getTezina() > kapacitet) {
			 System.out.println("Nema mesta za vocku: " + vocka.getNaziv() + " tezine " + vocka.getTezina() + " g. Sledeca akcija...");
		 } else  if(trenutnaTezinaVoca + vocka.getTezina() > kapacitetSokovnika) {
			 throw new PremasenKapacitetException();
		 } else if(!vocka.getTrula()) {
			vockeUPosudi.add(vocka);
			trenutnaTezinaVoca += vocka.getTezina();
			System.out.println("Ubacena vocka: " + vocka.getNaziv() + " "  + vocka.getTezina() + " g");
		 } else {
			System.out.println("Trule vocke se ne mogu ubaciti u posudu!");
		 }
	}
	
	public void prikaziSadrzaj(List<Vocka> vocke) {
		System.out.println("Trenutno stanje u posudi: ");
		for(Vocka vocka: vocke) {
			System.out.println(vocka.getNaziv() + " sorte " + ((Jabuka) vocka).getSorta()  + " od " + vocka.getTezina() + " grama.");
		}
	}
	
	public List<Vocka> getVocke() {
		return vockeUPosudi;
	}
	
	public int getTrenutnaTezinaVoca() {
		return trenutnaTezinaVoca;
	}
	
	public int getKapacitetPosude() {
		return kapacitet;
	}
	
	public int getBrojVockiUPosudi() {
		return vockeUPosudi.size();
	}
	
	public void setTrenutnaTezinaJeNula() {
		trenutnaTezinaVoca = 0;
	}

}













