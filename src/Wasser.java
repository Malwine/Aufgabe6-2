
public class Wasser extends Getraenk {

	public Wasser(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		if (menge >= 0) {  
			menge = menge - 200;
			if (menge <= 0) {menge = 0; }
		}
		return true;
	}

	public String status() {
		return ("Wasser: " + name + " " + menge + "ml");
	}
	

}
