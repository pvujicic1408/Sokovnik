package sokovnik;

import
java.util.*;

public class Sokovnik {
	private final int MINIMALNA_TEZINA_JABUKE_U_GRAMIMA = 100;
	private final int MAKSIMALNA_TEZINA_JABUKE_U_GRAMIMA = 300;
	private final double VEROVATNOCA_DA_JE_JABUKA_TRULA = 0.2;
	private final int KAPACITET_SOKOVNIKA = 3000;

	private Random rand = new Random();	
	private PosudaZaVoce posuda;
	private Cediljka cediljka;
	
	public Sokovnik() {
		posuda = new PosudaZaVoce();
		cediljka = new Cediljka();
	}
	
	public int getKapacitetSokovnika() {
		return KAPACITET_SOKOVNIKA;
	}
	
	public int getKapacitetPosude() {
		return posuda.getKapacitetPosude();
	}
	
	public List<Vocka> getVockeUPosudi(){
		return posuda.getVocke();
	}
	
	public boolean proveriDaLiJePosudaPrazna() {
		if(posuda.getBrojVockiUPosudi() != 0) {
			return false;
	  } else return true;
	}
	
	public void iscediVoceIzPosude() {
		cediljka.iscedi(getVockeUPosudi());
		isprazniPosudu();
	}
	
	public Jabuka konstruisiVocku() {
		Jabuka jabuka = new Jabuka("Jabuka", rand.nextInt(MAKSIMALNA_TEZINA_JABUKE_U_GRAMIMA - MINIMALNA_TEZINA_JABUKE_U_GRAMIMA + 1) + MINIMALNA_TEZINA_JABUKE_U_GRAMIMA, rand.nextDouble() < VEROVATNOCA_DA_JE_JABUKA_TRULA );
		return jabuka;
	}
	
	public void ubaciVoceUPosudu() {
		try {
			posuda.dodajVocku(konstruisiVocku(), KAPACITET_SOKOVNIKA);
		} catch (PremasenKapacitetException e) {}
	}
	
	public void isprazniPosudu() {
		posuda.getVocke().clear();
		posuda.setTrenutnaTezinaJeNula();
	}
	
	public void prikaziStanjeUPosudi() {
		posuda.prikaziSadrzaj(getVockeUPosudi());;
	}
	
	public void prikaziTrenutnuTezinuVocaUPosudi() {
		System.out.println("Trenutna tezina voca u posudi je " + posuda.getTrenutnaTezinaVoca() + " g.");
	}
	
	public void getUkupnoIscedjenogSoka() {
		System.out.println("Ukupno iscedjeno soka: " + String.format("%.1f",cediljka.getUkupnoSoka()) + " g");
	}
}


