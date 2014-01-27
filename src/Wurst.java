
public class Wurst extends Speise	{

	public Wurst(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		if (menge >= 20) {          //otherwise menge will be negative at some point
			menge = menge - 20; }
		return true;
	}

	public boolean trinken() {
		return false;
	}
	
	public String status() {
		return ("Wurst: " + name + " " + menge + "g");
	}
	
}
