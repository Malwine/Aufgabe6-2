
public class Brot extends Speise {

	private static String brotsorte = "";
	
	public Brot(int brot, int menge) {
		super(brotname(brot), menge);
	}

	public static String brotname (int brot)	{
		if 	    (brot == 0) {brotsorte = "Weissbrot";}
		else if (brot == 1) {brotsorte = "Schwarzbrot";}
		else if (brot == 2) {brotsorte = "Mischbrot";}
		else 				{brotsorte = "Spezialbrot";}
		return brotsorte;
	}
	
	public boolean essen() {
		if (menge >= 0) {        		  //if there is brot left
			menge = menge - 50;  		  //eat brot
			if (menge <= 0) {menge = 0; } //if you eat more although its empty... it will be empty still... 
										  //otherwise it would get negative
		}
		return true;
	}

	public boolean trinken() {
		return false;
	}
	
	public String status() {
		return ("Brot: " + brotsorte + " " + menge + "g");
	}


}
