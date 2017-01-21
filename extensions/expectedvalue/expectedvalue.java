package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		double p=ap.nextDouble("What's your game-succeed probability?");
		double Gamer=190000*p+5000*(1-p);
		double Programmer=(double)(Math.round((Math.random()*50000+110000)*10))/10;
		boolean Gamerbig=true;
		Gamerbig=(Gamer>=Programmer);
		System.out.println("Gamer: $"+Gamer);
		System.out.println("Programmer: $"+Programmer);
		System.out.println("You should be a gamer and not a programmer? "+Gamerbig);
		
		double EUGamer=(double)(Math.round(3*Math.sqrt(Gamer)*10))/10;
		double EUProgrammer=(double)(Math.round(2*Math.sqrt(Programmer)*10))/10;
		boolean GamerEUbig=true;
		GamerEUbig=(EUGamer>=EUProgrammer);
		System.out.println("EU(Gamer): "+EUGamer);
		System.out.println("EU(Programmer): "+EUProgrammer);
		System.out.println("You should accept the gamer job over the programmer job? "+GamerEUbig);
	}
}
