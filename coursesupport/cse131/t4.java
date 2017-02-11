package cse131;

public class t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		String names[]={"HappyBBQ","FancyFood","EatRite","GoodEats","HungryHippo"};
		double prices[]={1.25, 3.50, 8.00, 2.75, 10.15};
		int N = ap.nextInt("How many people will be at the party?"); 
		double B = ap.nextDouble("What is your budget?");
		System.out.println("For a party of "+N);
		double cost=0;
		for(int i=0;i<=4;i++){
			cost=(double)(Math.round(prices[i]*N*1000))/1000;
			if(cost>B){
				System.out.println(names[i]+" will cost $"+cost+" which is $"+(cost-B)+" above budget");
			}
			if(cost<B){
				System.out.println(names[i]+" will cost $"+cost+" which is $"+(B-cost)+" below budget");
			}
			if(cost==B){
				System.out.println(names[i]+" will cost $"+cost+" which is exactly the budget");
			}
		}
	}

}
