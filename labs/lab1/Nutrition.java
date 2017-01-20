package lab1;

import java.text.DecimalFormat;

import cse131.ArgsProcessor;

public class Nutrition {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		String name=ap.nextString("What's the name of the food?");
		double carbs=ap.nextDouble("How much carbs in here?");
		double fat=ap.nextDouble("How much fat in here?");
		double protein=ap.nextDouble("How much protein in here?");
		double statedCals=ap.nextDouble("How much calories is available here?");
		
		DecimalFormat df2 = new DecimalFormat("#.00");
		DecimalFormat df1=new DecimalFormat("#.0");
		double a=4*carbs;
		double b=(double)(Math.round(9*fat*10))/10;
		double c=4*protein;
		double d=a+b+c-statedCals;
		double e=d/4;
		
		double f=100*a/statedCals;
		double g=100*b/statedCals;
		double h=100*c/statedCals;
		
		boolean LowCarb=true;
				LowCarb=(f<=25);
		boolean Lowfat=true;
		        Lowfat=(g<=15);
		boolean heads=true;
		        heads=Math.random()>0.5;
		
		System.out.println(name+" has");
		System.out.println(carbs+" grams of carbs= "+df1.format(a)+" calories");
		System.out.println(fat+" grams of fat= "+b+" calories");
		System.out.println(protein+" grams of protein= "+df1.format(c)+" calories"+"\r\n");
		System.out.println("This food is said to have "+statedCals+" (available) Calories");
		System.out.println("with "+df1.format(d)+" unavailable Calories, this food has "+df2.format(e)+" grams of fiber"+"\r\n");
		System.out.println("Approximately");
		System.out.println(df1.format(f)+"%"+" of your food is carbohydrates");
		System.out.println(df1.format(g)+"%"+" of your food is fat");
		System.out.println(df1.format(h)+"%"+" of your food is protein"+"\r\n");
		System.out.println("This food is acceptable for a low-carb diet? "+LowCarb);
		System.out.println("This food is acceptable for a low-fat diet? "+Lowfat);
		System.out.println("By coin flip, you should eat this food? "+heads);
		
		
		
	}
}
