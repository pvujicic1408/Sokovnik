package sokovnik;

import
java.util.*;

public class PosudaZaVoce {
	public static final double KAPACITET_POSUDE=3000;
	int trenutnaTezinaVoca = 0;
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
			System.out.println("Ubacena vocka: " + vocka.getNazivVocke() + " "  + vocka.getTezinaVocke() + " g");
		}else {
			System.out.println("Trule vocke se ne mogu ubaciti u posudu!");
		}
	}
	
	public List<Vocka> getVockeUPosudi() {
		return vockeUPosudi;
	}
	
	public int getTrenutnaTezinaVoca() {
		return trenutnaTezinaVoca;
	}
	
	public void isprazniPosudu() {
		vockeUPosudi.clear();
		trenutnaTezinaVoca = 0;
	}

}
