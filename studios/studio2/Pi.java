package studio2;

import cse131.ArgsProcessor;

public class Pi {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int n=ap.nextInt("What's the times of experiment?");
		int k=0;
		
		
		for(int i=1;i<=n;i++){
		double x=Math.random();
		double y=Math.random();
		
		if((x*x+y*y)<=1){
			k=k+1;
		}
	}
		double Pi=4*(double)k/(double)n;
		System.out.println(Pi);
	}

}
