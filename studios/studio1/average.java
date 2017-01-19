package studio1;

import cse131.ArgsProcessor;

public class average {
	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int n1=ap.nextInt("What's the first integer?");
		int n2=ap.nextInt("What's the second integer?");
		
		double average=(n1+n2)/2.0;
		
		System.out.println("Average of "+n1+" and "+n2+" is "+average);
		
		
	}

}
