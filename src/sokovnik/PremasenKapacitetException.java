package sokovnik;

public class PremasenKapacitetException extends Exception {
	public PremasenKapacitetException() {
		System.out.println("Premasen kapacitet sokovnika!");
		System.exit(0);
	}
}
