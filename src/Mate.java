
public class Mate extends Getraenk{
	
	public Mate(String name) {
		super(name,menge);
		menge = 500;
	}

	public boolean essen() {
		return false;
	}

	public boolean trinken() {
		return false;
	}


}
