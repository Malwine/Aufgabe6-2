
public class Texter {

	
	public static void main(String[] args) {
		
		//BROT
		System.out.println("---BROT---");
		
		Brot newBrot = new Brot(1,200);
		System.out.println(newBrot.status());
		newBrot.essen();
		System.out.println(newBrot.status());
		
		newBrot.essen();						//eats brot
		newBrot.essen();						//until empty
		newBrot.essen();						//then tries to eat more brot - but its empty
		newBrot.essen();          
		newBrot.essen();
		System.out.println(newBrot.status());
		
		//brot trinken() test
		System.out.println("");
		System.out.println("------ trinken?");
		newBrot.trinken();						//tests, if trinken does nothing
		System.out.println(newBrot.status());
		System.out.println("");
		
		//WURST
		System.out.println("---WURST---");
		Wurst newWurst = new Wurst("Soja Spezial", 150);
		System.out.println(newWurst.status());
		
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
		System.out.println("");
		
		//WASSER
		System.out.println("---WASSER---");
		Wasser newWasser = new Wasser("Sprudel", 330);
		System.out.println(newWasser.status());
		newWasser.trinken();					//drinks 200ml = 130
		System.out.println(newWasser.status());
		newWasser.trinken();					//drinks 200ml = empty
		newWasser.trinken();					//tries to drink = empty
		newWasser.trinken();					//tries to drink = empty
		System.out.println(newWasser.status()); // output 0
		System.out.println("");
		
		System.out.println("---MATE---");
		Mate neueMate = new Mate("Flora Power", 330);
		System.out.println(neueMate.status());
		neueMate.trinken();					
		
	}

}
