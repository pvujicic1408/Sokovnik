package sokovnik;

import
java.util.*;

public class Jabuka extends Vocka {
	private String sortaJabuke;
	
	public Jabuka(String nazivVocke, double tezinaVocke, boolean isTrula) {
		super(nazivVocke, tezinaVocke, isTrula);
		setSortaJabuke();
	}
	
	public void setSortaJabuke() {
		String[] sorte = {"Zlatni delises", "Crveni delises", "Greni smit"};
		Random rand = new Random();
        this.sortaJabuke = sorte[rand.nextInt(sorte.length)];
	}
	
	public String getSorta() {
        return sortaJabuke;
    }

}
