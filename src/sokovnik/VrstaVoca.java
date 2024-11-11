package sokovnik;

public enum VrstaVoca {
	JABUKA(1);
	
	private int opcija;
	
	VrstaVoca(int opcija){
		this.opcija=opcija;
	}
	
	public int getOpcija() {
		return opcija;
	}
	
	public static VrstaVoca izOpcije(int opcija) {
		for(VrstaVoca vv : VrstaVoca.values()) {
			if(vv.getOpcija()==opcija) {
				return vv;
			}
		}
		return null;
	}
	
}
