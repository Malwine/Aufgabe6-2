
public abstract class Speise extends Lebensmittel{

	public Speise(String name, int menge) {
		super(name, menge);
	}

	public boolean essen(int menge) {
		return false;
	}

//	public boolean trinken(int menge) {
//		return false;
//	}

	public String status() {
		return null;
	}



}
