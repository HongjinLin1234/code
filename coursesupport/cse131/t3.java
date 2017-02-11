package cse131;

public class t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int N = ap.nextInt("How many random numbers?");
		double j=0;
		int count=0;
		for(int i=1;i<=N;i++){
			j=Math.random();
			if(j>0.75){
				count=count+1;
			}
		}
		double Percent=(double)Math.round((double)count/N*10000)/100;
		System.out.println("You asked for "+N+" random numbers.");
		System.out.println("Of those, "+Percent+"% were greater than 0.75.");
	}

}
