
public class Mate extends Getraenk{
	
	public Mate(String name) {           // this is a constructor we learned about with Robert
		this(name, 500);				 // if the constructor only gets the name string, then it sets menge to 500
		}
	
	public Mate(String name,int menge) {   //original constructor
		super(name,menge);
	}
	
	public boolean essen() {
		return false;
	}

	public boolean trinken() { 						// I recognized that mate trinken() is not used in the kuehlschrank tester
		if (menge >= 0) {  							// but "der vollstaendigkeit halber" - you know
			menge = menge - 100;					//description: see Wasser.trinken()
			if (menge <= 0) {menge = 0; }
		}
		return true;
	}

	public String status() {
		return ("Mate: " + name + " " + menge + "ml");
	}
	

}
