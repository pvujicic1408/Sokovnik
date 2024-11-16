package sokovnik;

import
java.util.*;

public class Cediljka {
	private final double KOEFICIJENT_ZA_KOLICINU_ISCEDJENOG_SOKA_IZ_JEDNE_VOCKE = 0.4
	private static double ukupnoSoka = 0;
	
	public void iscedi(List<Vocka> vockeUPosudi) {
		double kolicinaSokaOdJednogCedjenja = 0;
		for(Vocka vocka : vockeUPosudi) {
			ukupnoSoka += vocka.getTezina() * KOEFICIJENT_ZA_KOLICINU_ISCEDJENOG_SOKA_IZ_JEDNE_VOCKE;
			kolicinaSokaOdJednogCedjenja += vocka.getTezina() * KOEFICIJENT_ZA_KOLICINU_ISCEDJENOG_SOKA_IZ_JEDNE_VOCKE;
		}
		System.out.println("Iscedjeno " + String.format("%.1f",kolicinaSokaOdJednogCedjenja) + " g soka.");
		sokovnik.PosudaZaVoce.isprazniPosudu();
	} 
	
	public double getUkupnoSoka() {
		return ukupnoSoka;
	}

}
