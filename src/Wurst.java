
public class Wurst extends Speise{

	public Wurst(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		return false;
	}


}
