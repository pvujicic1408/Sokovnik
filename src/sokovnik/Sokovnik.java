package sokovnik;

import
java.util.*;

public class Sokovnik {
	private PosudaZaVoce posuda;
	private Cediljka cediljka;
	private Random rand;
	
	public Sokovnik() {
		posuda = new PosudaZaVoce();
		cediljka = new Cediljka();
		rand = new Random();
	}
	
	public void izvrsiAkciju() {
		double verovatnocaCedenja = 0.30;
        double verovatnocaUbacivanja = 0.70;
        
		double akcija = rand.nextDouble();
		
		if(akcija < verovatnocaCedenja) {
			System.out.println("Cedjenje...");
			cediljka.iscedi(posuda);
		} else if (akcija < verovatnocaCedenja + verovatnocaUbacivanja) {
			System.out.println("Ubacivanje voca u posudu...");
			Jabuka jabuka = new Jabuka("Jabuka", rand.nextInt(201) + 100, rand.nextDouble() < 0.2 );
			try {
				posuda.dodajVocku(jabuka);
			} catch (PremasenKapacitetException e) {
				System.out.println("Kapacitet posude za voce je premasen!");
			}
		}
	}
	
	public double getUkupnoSoka() {
		return cediljka.getUkupnoSoka();
	}

}
