package sokovnik;

import
java.util.*;

public class Sokovnik {
	Random rand = new Random();
	private PosudaZaVoce posuda;
	private Cediljka cediljka;
	
	public Sokovnik() {
		posuda = new PosudaZaVoce();
		cediljka = new Cediljka();
	}
	
	public void izvrsiAkciju() {
		double verovatnocaCedjenja = 0.30;
        double verovatnocaUbacivanja = 0.70;
        
		double akcija = rand.nextDouble();
		
		if(akcija < verovatnocaCedjenja && posuda.getVockeUPosudi().size()!=0 || posuda.getTrenutnaTezinaVoca() > posuda.KAPACITET_POSUDE) {
			System.out.println("Cedjenje...");
			cediljka.iscedi(posuda);
		} else {
			System.out.println("Ubacivanje voca u posudu...");
			konstruisiVocku();
		}
	}
	
	public void konstruisiVocku() {
		int randomIndex = rand.nextInt(VrstaVoca.values().length) + 1;
		VrstaVoca vrsta = VrstaVoca.izOpcije(randomIndex);
		Vocka vocka = null;
		
		switch(vrsta) {
			case JABUKA:
				vocka = new Jabuka("Jabuka", rand.nextInt(201) + 100, rand.nextDouble() < 0.2 );
				break;
		}	
		
		try {
			posuda.dodajVocku(vocka);
			prikaziStanjePosude(posuda);
			System.out.println("Trenutna tezina voca u posudi je: " + posuda.trenutnaTezinaVoca + " g.");
		} catch (PremasenKapacitetException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void prikaziStanjePosude(PosudaZaVoce posuda) {
		List<Vocka> voceUPosudi = posuda.getVockeUPosudi();
		System.out.println("Trenutno stanje u posudi: ");
		for(Vocka vocka: voceUPosudi) {
			System.out.println(vocka.getNazivVocke() + " sorte " + (vocka instanceof Jabuka ? ((Jabuka) vocka).getSorta() : "N/A") + " od " + vocka.getTezinaVocke() + " grama.");
		}
		
	}
	
	public double getUkupnoSoka() {
		return cediljka.getUkupnoSoka();
	}

}

