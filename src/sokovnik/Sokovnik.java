package sokovnik;

import
java.util.*;

public class Sokovnik {
	public PosudaZaVoce posuda;
	public Cediljka cediljka;
	public final int KAPACITET_SOKOVNIKA = 3000;
	
	public Sokovnik() {
		posuda = new PosudaZaVoce();
		cediljka = new Cediljka();
	}
	
	public void proveraKapacitetaSokovnika() throws PremasenKapacitetException {
		if(sokovnik.PosudaZaVoce.getTrenutnaTezinaVoca() > KAPACITET_SOKOVNIKA) {
			throw new PremasenKapacitetException();
		} else cediljka.iscedi(posuda.getVockeUPosudi());
	}
}

