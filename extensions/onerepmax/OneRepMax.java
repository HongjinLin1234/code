package onerepmax;

import java.text.DecimalFormat;

import cse131.ArgsProcessor;

public class OneRepMax {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		DecimalFormat df2 = new DecimalFormat("#");
		int w=ap.nextInt("What's your successful weight?");
		int r=ap.nextInt("How many successful reps?");
		int dr=ap.nextInt("What's the desire reps?");
		double OneRM=w*(1+(r/30.0));
		OneRM=Math.round(OneRM);
        if(OneRM%5!=0){
	OneRM=OneRM-(OneRM%5);
}
        double wdr=OneRM/(1+(dr/30.0));
        wdr=Math.round(wdr);
        if(wdr%5!=0){
	wdr=wdr-(wdr%5);
}
        
        System.out.println("One-rep max: "+df2.format(OneRM));
        System.out.println("Weight for "+dr+" reps: "+df2.format(wdr));
        System.out.println("95% 1 RM: "+df2.format(OneRM*0.95));
        System.out.println("90% 1 RM: "+df2.format(OneRM*0.90));
        System.out.println("85% 1 RM: "+df2.format(OneRM*0.85));
        System.out.println("80% 1 RM: "+df2.format(OneRM*0.80));
        System.out.println("75% 1 RM: "+df2.format(OneRM*0.75));
        System.out.println("70% 1 RM: "+df2.format(OneRM*0.70));
        System.out.println("65% 1 RM: "+df2.format(OneRM*0.65));
        System.out.println("60% 1 RM: "+df2.format(OneRM*0.60));
        System.out.println("55% 1 RM: "+df2.format(OneRM*0.55));
        System.out.println("50% 1 RM: "+df2.format(OneRM*0.50));
}
}
