
public abstract class Getraenk extends Lebensmittel{

	public Getraenk(String name, int menge) {
		super(name, menge);
	}

	public boolean essen(int menge) {
		return false;
	}

	public boolean trinken(int menge) {
		return false;
	}

	public String status() {
		return null;
	}

	

}
