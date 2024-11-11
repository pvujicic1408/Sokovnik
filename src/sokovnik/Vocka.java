/*Klasom Voće se opisuje voćka, koja je određena svojim nazivom, težinom (ceo broj, u gramima) i time da li 
 * je trula ili ne. 
 * Jabuka je voće koje je dodatno opisano sortom. 
 * Sokovnik se sastoji iz dva dela: posude  za voće i cediljke. 
 * Posuda za voće ima svoj kapacitet i može da sadrži voće. 
 * U posudu za voće (ako u njoj ima dovoljno prostora) mogu da dodam voćku. 
 * Cediljka služi za ceđenje voća i radi tako što iscedi sve voće koje se nalazi u posudi. Pri svakom ceđenju 
 * možemo da pratimo/saznamo koliko soka je dobijeno. 
 * Ceđenjem jedne voćke se dobija količina soka jednaka 40% težine voćke. 
 * Sokovnik se ne sme prepuniti, a takođe ne prihvata trule voćke. 
 * 
 * Napisati program koji simulira rad sokovnika u koji može da stane 3kg jabuka.
 * 
- Nad sokovnikom se vrše akcije ceđenja i ubacivanja jabuka, pri čemu se svaka akcija loguje u vidu ispisa na konzolu.
- Sokovnik je programiran da izvrši 100 akcija ceđenja ili ubacivanja jabuka, pri čemu se ceđenje voća radi sa 
verovatnoćom 30%, a dodavanje jabuke sa verovatnoćom od 70%.
- Jabuka ima težinu u rasponu od 100g do 300g.
- Jabuka ima 20% verovatnoće da bude trula.
- Na kraju izvršavanja programa ispisati koliko je ukupno soka dobijeno ceđenjem.

Ukoliko se desi da se kapacitet sokovnika premaši, potrebno je baciti PremasenKapacitetException i 
prekinuti izvršavanje programa.*/


package sokovnik;

import
java.util.*;

class Vocka {
	private String nazivVocke;
	private int tezinaVocke;
	private boolean isTrula;
	
	public Vocka(String nazivVocke, int tezinaVocke, boolean isTrula) {
		setNazivVocke(nazivVocke);
		setTezinaVocke(tezinaVocke);
		this.isTrula=isTrula;
	}
	
	public void setNazivVocke(String nazivVocke) {
        if (nazivVocke.matches("[a-zA-Z]+")) {
            this.nazivVocke = nazivVocke;
        } else {
            System.out.println("Nevalidan unos. Pokusajte ponovo.");
            System.exit(0);
        }
    }
	
	 public void setTezinaVocke(int tezinaVocke) {
	        if (tezinaVocke >= 100 && tezinaVocke <= 300) {
	            this.tezinaVocke = tezinaVocke;
	        } else {
	        	System.out.println("Težina voćke mora biti između 100g i 300g.");
	            System.exit(0);
	        }
	    }
	
	public String getNazivVocke() {
		return nazivVocke;
	}
	
	public int getTezinaVocke() {
		return tezinaVocke;
	}
	
	public boolean getIsTrula() {
		return isTrula;
	}
}
