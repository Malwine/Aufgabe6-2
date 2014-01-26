
public class Wasser extends Getraenk {

	public Wasser(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		menge = menge -200;
		return true;
	}

	

}
