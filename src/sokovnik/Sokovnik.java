package sokovnik;

import
java.util.*;

public class Sokovnik {
	private PosudaZaVoce posuda;
	private Cediljka cediljka;
	private final int KAPACITET_SOKOVNIKA = 3000;
	
	public Sokovnik() {
		posuda = new PosudaZaVoce();
		cediljka = new Cediljka();
	}
	
	public void proveraKapacitetaSokovnika() throws PremasenKapacitetException {
		if(posuda.getTrenutnaTezinaVoca() > KAPACITET_SOKOVNIKA) {
			throw new PremasenKapacitetException();
		} else cediljka.iscedi(posuda.getVockeUPosudi());
	}
	
	public int getKapacitetPosude() {
		return posuda.getKapacitetPosude();
	}
}

