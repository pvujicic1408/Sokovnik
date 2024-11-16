package sokovnik;

import
java.util.*;

public class Jabuka extends Vocka {
	private String sorta;
	Random rand = new Random();
	
	public Jabuka(String naziv, int tezina, boolean trula) {
		super(naziv, tezina, trula);
		setSorta();
	}
	
	public void setSorta() {
		String[] sorte = {"Zlatni delises", "Crveni delises", "Greni smit"};
        this.sorta=  sorte[rand.nextInt(sorte.length)];
	}
	
	public String getSorta() {
        return sorta;
    }
}
