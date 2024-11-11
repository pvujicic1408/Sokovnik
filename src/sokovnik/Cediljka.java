package sokovnik;

import
java.util.*;

public class Cediljka {
	private double ukupnoSoka;
	
	public Cediljka() {
		ukupnoSoka = 0;
	}
	
	public void iscedi(PosudaZaVoce posuda) {
		List<Vocka> voceUPosudi = posuda.getVockeUPosudi();
		
		double kolicinaSokaOdJednogCedjenja = 0;
		
		for(Vocka vocka : voceUPosudi) {
			ukupnoSoka = ukupnoSoka + vocka.getTezinaVocke() * 0.4;
			kolicinaSokaOdJednogCedjenja += vocka.getTezinaVocke() * 0.4;
		}
		
		System.out.println("Iscedjeno " + String.format("%.1f",kolicinaSokaOdJednogCedjenja) + " g soka.");
		posuda.isprazniPosudu();
	}
	
	public double getUkupnoSoka() {
		return ukupnoSoka;
	}

}
