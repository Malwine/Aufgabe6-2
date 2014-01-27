
public class Texter {

	
	public static void main(String[] args) {
		
		//BROT
		System.out.println("---BROT---");
		
		Brot newBrot = new Brot(1,200);
		System.out.println(newBrot.status());
		System.out.println("------");
		newBrot.essen();
		System.out.println(newBrot.status());
		
		System.out.println("");
		System.out.println("------ trinken?");
		newBrot.trinken();						//tests, if trinken does nothing
		System.out.println(newBrot.status());
		
		newBrot.essen();						//tests, if essen stops when no brot menge left 
		newBrot.essen();						//
		newBrot.essen();
		newBrot.essen();          
		newBrot.essen();
		System.out.println("------");
		System.out.println(newBrot.status());
		System.out.println("");
		
		//WURST
		System.out.println("---WURST---");
		Wurst newWurst = new Wurst("Soja Spezial", 150);
		System.out.println(newWurst.status());
		
		System.out.println("------");
		newWurst.essen();						//eats 20g = 130g
		System.out.println(newWurst.status());  //output
		newWurst.essen();						//eats 20g = 110g
		newWurst.essen();						//eats 20g = 90g
		newWurst.essen();						//eats 20g = 70g
		newWurst.essen();						//eats 20g = 50g
		System.out.println(newWurst.status());  //output
		newWurst.essen();						//eats 20g = 30g
		newWurst.essen();						//eats 20g = 10g
		System.out.println(newWurst.status());  //output
		newWurst.essen();						//eats 20g = 10g 	
		System.out.println(newWurst.status());  // stays at 10g 
	}

}
