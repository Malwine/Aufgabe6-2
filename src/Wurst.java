
public class Wurst extends Speise	{

	public Wurst(String name, int menge) {
		super(name, menge);
	}

	public boolean essen() {
		if (menge >= 0) {          //otherwise menge will be negative at some point
			menge = menge - 10; 
			if (menge <= 0) {menge = 0; }
		}
		return true;
	}

	public boolean trinken() {
		return false;
	}
	
	public String status() {
		return ("Wurst: " + name + " " + menge + "g");
	}
	
}
