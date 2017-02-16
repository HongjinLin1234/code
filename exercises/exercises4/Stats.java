package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//
		double sum=0;
		int count=0;
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
        while (!StdIn.isEmpty()){
        	double d=StdIn.readDouble();
        	sum=sum+d;
        	count=count+1;
        	if(d>max){max=d;}
        	if(d<min){min=d;}
        }
        System.out.println("sum is "+sum);
        System.out.println("count is "+count);
        System.out.println("average is "+(sum/count));
        System.out.println("min is "+min);
        System.out.println("max is "+max);
	}

}
