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
		
		for(Vocka vocka : voceUPosudi) {
			ukupnoSoka = ukupnoSoka + vocka.getTezinaVocke() * 0.4;
			System.out.println("Iscedjeno " + ukupnoSoka + " g soka.");
		}
		
		posuda.isprazniPosudu();
	}
	
	public double getUkupnoSoka() {
		return ukupnoSoka;
	}

}
