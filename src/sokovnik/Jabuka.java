package sokovnik;

import

java.util.*;
//import java.util.Random;


public class Jabuka extends Vocka {
	private String sortaJabuke;
	
	public Jabuka(String nazivVocke, double tezinaVocke, boolean isTrula, String sortaJabuke) {
		super(nazivVocke, tezinaVocke, isTrula);
		setsortaJabuke();
	}
	
	public void setsortaJabuke() {
		String[] sorte = {"Zlatni delises", "Crveni delises", "Greni smit"};
		Random rand = new Random();
        this.sortaJabuke = sorte[rand.nextInt(sorte.length)];
	}
	
	public String getSorta() {
        return sortaJabuke;
    }
	
	public static Jabuka randomJabuka() {
		Random rand = new Random();
		String nazivVocke = "Jabuka";
		double tezinaVocke = 100  + rand.nextDouble(201);
		boolean 
	}

}
