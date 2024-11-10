package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	private static final double KAPACITET_POSUDE=3000;
	double trenutnaTezinaVoca = 0;
	private List<Vocka> vockeUPosudi;
	
	public PosudaZaVoce() {
		vockeUPosudi = new ArrayList();
	}
	
	public void dodajVocku(Vocka vocka) throws PremasenKapacitetException {
		if(trenutnaTezinaVoca + vocka.getTezinaVocke() > KAPACITET_POSUDE) {
			throw new PremasenKapacitetException("Kapacitet posude za voce je premasen!");
		}
		if(!vocka.getIsTrula()) {
			vockeUPosudi.add(vocka);
			trenutnaTezinaVoca += vocka.getTezinaVocke();
		}else {
			System.out.println("Trule vocke nisu dozvoljene!");
		}
	}
	
	public List<Vocka> getVockeUPosudi() {
		return vockeUPosudi;
	}
	
	public double getTrenutnaTezinaVoca() {
		return trenutnaTezinaVoca;
	}
	
	public void isprazniPosudu() {
		vockeUPosudi.clear();
		trenutnaTezinaVoca = 0;
	}

}
