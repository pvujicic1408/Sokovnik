package sokovnik;

public class PremasenKapacitetException extends Exception {
	public PremasenKapacitetException() {
		System.out.println("Pokvaren sokovnik zbog prevelike kolicine voca!");
		System.exit(0);
		
	}

}
