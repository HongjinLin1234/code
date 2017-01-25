package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

		ArgsProcessor ap=new ArgsProcessor(args);
		int inches=ap.nextInt("How many inches?");
		int feet=inches/12;
		int remainingInches=inches%12;
		if(feet==1){
			System.out.println("We have "+feet+" foot");
		}
		else{
			System.out.println("We have "+feet+" feet");
			}
			if(remainingInches==1){
				System.out.println(remainingInches+" inch");
			}
			else{
		
		System.out.println(remainingInches+" inches");
			}
	
		
	}

}
