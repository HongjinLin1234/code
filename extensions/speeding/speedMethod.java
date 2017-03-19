package speeding;

import cse131.ArgsProcessor;

public class speedMethod {
    public static int Over(int a){
    	int b=a-60;
    	int c=(b<0)?0:b;
    	return c;
    }
    public static int Total(int a){
    	int b=a-70;
    	int c=10*b+50;
    	int d=(c<50)?0:c;
    	int e=a-60;
    	int f=((e>= 10)||(e<=0)) ? d : 50;
    	return f;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int speed=ap.nextInt("What's your speed(MPH)?");
		int a=Over(speed);
		int TotalFine=Total(speed);
		System.out.println("You reported a speed of "+speed+" MPH for a speed limit of 60 MPH");
		System.out.println("You went "+a+" MPH over the speed limit. Your fine is $"+TotalFine);
	}

}
