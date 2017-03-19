package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int speed=ap.nextInt("What's your speed(MPH)?");
		int Overspeed=speed-60;
		int a=(Overspeed<0)?0:Overspeed;
		int Leftspeed=Overspeed-10;
		int Fine=10*Leftspeed+50;
		
		int b=(Fine<50)?0:Fine;
			
		
		
		int TotalFine=((Overspeed>= 10)||(Overspeed<=0)) ? b : 50;
		System.out.println("You reported a speed of "+speed+" MPH for a speed limit of 60 MPH");
		System.out.println("You went "+a+" MPH over the speed limit. Your fine is $"+TotalFine);
	}
}
