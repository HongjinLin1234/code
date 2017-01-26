package studio2;

import cse131.ArgsProcessor;

public class Ruin {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		double StartAmount=ap.nextDouble("What's the start amount?");
		double WinChance=ap.nextDouble("What's the possibility to win?");
		double WinAmount=ap.nextDouble("What's the amount of money to win?");
		int TotalPlays=ap.nextInt("What's the number of time to simulate?");
		double LossChance=1-WinChance;
		double percentage1=LossChance/WinChance;
		int lose=0;
		
		
			for (int i=1;i<=TotalPlays;i++){
			int j=1;
		  double amount=StartAmount;
		  while((amount<WinAmount)&&(amount!=0)){
			  
			double t=Math.random();
			if (t<=WinChance){
				amount=amount+1;
			}
			else
			{
				amount=amount-1;
			}
			j=j+1;
		  }
			if (amount==0){
				System.out.println("Simulation"+i+":"+j+" rounds LOSE");
				lose=lose+1;
			}
			else{
				System.out.println("Simulation"+i+":"+j+" rounds WIN");
			}
			
			}
			System.out.println("Losses: "+lose+" Simulations: "+TotalPlays);
			double actual=(double)lose/(double)TotalPlays;
			double k=0;
			if (LossChance != WinChance)
			{k = (Math.pow(percentage1, StartAmount)- Math.pow(percentage1, WinAmount)) / (1 - Math.pow(percentage1, WinAmount));} 

		else
			{k = 1-(double)StartAmount / (double)WinAmount;}
			
			System.out.println("Actual Ruin Rate: "+actual+" Expect Ruin Rate: "+k);
	}
}
