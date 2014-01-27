
public abstract class Speise extends Lebensmittel{

	public Speise(String name, int menge) {
		super(name, menge);
	}

	public boolean essen(int menge) {
		return true;
	}

}
