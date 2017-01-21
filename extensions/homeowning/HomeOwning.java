package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

		public static void main(String[] args) {
			ArgsProcessor ap=new ArgsProcessor(args);
			String name=ap.nextString("What's the name of the apartment complex?");
			String zip=ap.nextString("What's the zip code of the apartment?");
			int MonthlyRent=ap.nextInt("What's the monthly rent of the apartment?");
			double DailyInterest=ap.nextDouble("What's the daily interest payment for your mortgage on the house?");
			
			int RentPerYear=MonthlyRent*12;
			double RentPerWeek=(double)(Math.round(RentPerYear/52.0*100))/100;
			double InterestPerYear=(double)(Math.round(DailyInterest*365*100))/100;
			double InterestPerWeek=(double)(Math.round(DailyInterest*7*100))/100;
			
			boolean ShouldRent=true;
			ShouldRent=RentPerYear<=InterestPerYear;
			
			System.out.println(name+" is located in the Zip Code "+zip);
			System.out.println("Rent Per Year: "+RentPerYear);
			System.out.println("Rent Per Week: "+RentPerWeek+"\r\n");
			System.out.println("Interest paid per year: "+InterestPerYear);
			System.out.println("Interest paid per week: "+InterestPerWeek+"\r\n");
			System.out.println("Should I rent? "+ShouldRent);
			
			

	}

}
