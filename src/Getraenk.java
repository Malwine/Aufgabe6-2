
public abstract class Getraenk extends Lebensmittel{

	public Getraenk(String name, int menge) {
		super(name, menge);
	}

	public boolean trinken(int menge) {
		return true;
	}

	

}
