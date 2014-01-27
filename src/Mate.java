
public class Mate extends Getraenk{
	
	public Mate(String name) {
		this(name, 500);
		}
	
	public Mate(String name,int menge) {
		super(name,menge);
	}
	

//	public static int matemenge(int NEUmenge) {
//		NEUmenge = 500;
//		return NEUmenge;
//	}
	
	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		return false;
	}

	public String status() {
		return ("Mate: " + name + " " + menge + "ml");
	}
	

}
