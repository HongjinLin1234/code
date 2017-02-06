package arrays;
import java.text.DecimalFormat;

import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("the number of people in the room");
		int table[][]=new int[13][32];
		for(int i=0;i<=N-1;i++){
			int a=(int)(Math.random()*12+1);
			int b=(int)(Math.random()*31+1);
			table[a][b]=table[a][b]+1;
		}
		int sum=0;
		double month[]=new double[13];
		for(int b=1;b<=12;b++){
		for(int a=1;a<=31;a++){
			 sum=sum+table[b][a];
		}
		month[b]=(double)Math.round((double)sum/N*10000)/100;
		System.out.println("the fraction of "+b+" is "+month[b]+"%");
		sum=0;
		}
		double monthsum=0;
		for(int b=1;b<=12;b++){
		  monthsum=monthsum+month[b];
		}
		double averagemonth=(double)Math.round(monthsum/12*100)/100;
		System.out.println("the average of 12 values is "+averagemonth+"%");
	    System.out.println();
	    
	    double day[]=new double[32];
	    for(int b=1;b<=31;b++){
			for(int a=1;a<=12;a++){
				 sum=sum+table[a][b];
			}
			day[b]=(double)Math.round((double)sum/N*10000)/100;
			System.out.println("the fraction of "+b+" is "+day[b]+"%");
			sum=0;
			}
	    double daysum=0;
		for(int b=1;b<=31;b++){
		  daysum=daysum+day[b];
		}
		double averageday=(double)Math.round(daysum/31*100)/100;
		System.out.println("the average of 12 values is "+averageday+"%");
	    System.out.println();
	    int g=0;
	    for(int b=1;b<=12;b++){
			for(int a=1;a<=31;a++){
				if(table[b][a]>=2){g=g+table[b][a];}
				
			}	
			}
	    double sameday=(double)Math.round((double)g/N*10000)/100;
	    System.out.println("The fraction of people born on exactly the same day: "+sameday+"%");
	
	}
}	