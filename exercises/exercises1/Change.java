package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
	ArgsProcessor ap=new ArgsProcessor(args);
	int InitialPennies=ap.nextInt("How many pennies?");
	int d=InitialPennies/100;
	int PenniesLeftAfterDollars=InitialPennies%100;
	int q=PenniesLeftAfterDollars/25;
	int PenniesLeftAfterQuarters=PenniesLeftAfterDollars%25;
	int dimes=PenniesLeftAfterQuarters/10;
	int PenniesLeftAfterDimes=PenniesLeftAfterQuarters%10;
	int n=PenniesLeftAfterDimes/5;
	int Pennies=PenniesLeftAfterDimes%5;
    
	
	System.out.println(d+" dollars");
	System.out.println(q+" quarters");
	System.out.println(dimes+" dimes");
	System.out.println(n+" nickles");
	System.out.println(Pennies+" Pennies");
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
