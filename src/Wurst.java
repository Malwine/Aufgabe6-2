
public class Wurst extends Speise	{

	public Wurst(String name, int menge) {
		super(name, menge);
	}

	public int essen() {
		return (menge - 10);
	}

	public boolean trinken() {
		return false;
	}
}
