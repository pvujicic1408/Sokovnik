package sokovnik;

import
java.util.*;

public class Cediljka {
	private static double ukupnoSoka;
	
	public Cediljka() {
		ukupnoSoka = 0;
	}
	
	public static void iscedi(List<Vocka> vockeUPosudi) {
		
		double kolicinaSokaOdJednogCedjenja = 0;
		
		for(Vocka vocka : vockeUPosudi) {
			ukupnoSoka = ukupnoSoka + vocka.getTezinaVocke() * 0.4;
			kolicinaSokaOdJednogCedjenja += vocka.getTezinaVocke() * 0.4;
		}
		
		System.out.println("Iscedjeno " + String.format("%.1f",kolicinaSokaOdJednogCedjenja) + " g soka.");
		sokovnik.PosudaZaVoce.isprazniPosudu();
	}
	
	public double getUkupnoSoka() {
		return ukupnoSoka;
	}

}
