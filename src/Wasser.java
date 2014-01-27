
public class Wasser extends Getraenk {

	public Wasser(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		if (menge >= 0) {     						//if there is water left 
			menge = menge - 200;					// you can drink it
			if (menge <= 0) {menge = 0; }			//if you drink more although its empty... it will be empty still...
		}
		return true;
	}

	public String status() {
		return ("Wasser: " + name + " " + menge + "ml");
	}
	

}
