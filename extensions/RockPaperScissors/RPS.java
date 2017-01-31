package RockPaperScissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int tight=0;
		int P1Win=0;
		int P2Win=0;
		int Times=ap.nextInt("How many times of simulation?");
		if (Times<=0){
			System.out.println("error");
		}
		else
		{
			for(int i=1;i<=Times;i++){
				double Player1=Math.round(Math.random()*3);
				double Player2=1;
				if(Player1<=1){System.out.println("Round "+i+" Player1: Rock, Player 2: Rock, tights");
				tight=tight+1;i=i+1;}
				else if((Player1<=2)&&(Player1>1)){System.out.println("Round "+i+" Player1: Paper, Player 2: Rock, 1 win");
				P1Win=P1Win+1;i=i+1;}
				else{System.out.println("Round "+i+" Player1: Scissors, Player 2: Rock, 2 win");
				P2Win=P2Win+1;i=i+1;}
				if(i>Times){break;}
				Player1=Math.round(Math.random()*3);
				Player2=2;
				if(Player1<=1){System.out.println("Round "+i+" Player1: Rock, Player 2: Paper, 2 win");
				P2Win=P2Win+1;i=i+1;}
				else if((Player1<=2)&&(Player1>1)){System.out.println("Round "+i+" Player1: Paper, Player 2: Paper, tights");
				tight=tight+1;i=i+1;}
				else{System.out.println("Round "+i+" Player1: Scissors, Player 2: Paper, 1 win");
				P1Win=P1Win+1;i=i+1;}
				if(i>Times){break;}
				Player1=Math.round(Math.random()*3);
				Player2=3;
				if(Player1<=1){System.out.println("Round "+i+" Player1: Rock, Player 2: Scissors, 1 win");
				P1Win=P1Win+1;}
				else if((Player1<=2)&&(Player1>1)){System.out.println("Round "+i+" Player1: Paper, Player 2: Scissors, 2 win");
				P2Win=P2Win+1;}
				else{System.out.println("Round "+i+" Player1: Scissors, Player 2: Scissors, tights");
				tight=tight+1;}
			}
			System.out.println(Times+" times of simulation.");
			System.out.println("P1 win: "+P1Win);
			System.out.println("P2 win "+P2Win);
			System.out.println("tights: "+tight);
		}
	}

}
