package sokovnik;

public class main {
	public static void main(String[] args) {
		Sokovnik sokovnik = new Sokovnik();
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Akcija " + i+1 + ":");
			sokovnik.izvrsiAkciju();
			System.out.println();
		}
		
		System.out.println("Ukupno iscedjeno soka: " + sokovnik.getUkupnoSoka() + " g");
		
	}

}
