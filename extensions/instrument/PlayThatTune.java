package instrument;
import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.*;
/*************************************************************************
 *  Compilation:  javac PlayThatTune.java
 *  Execution:    java PlayThatTune < input.txt
 *  Dependencies: StdAudio.java StdAudio.java
 *
 *  This is a data-driven program that plays pure tones from
 *  the notes on the chromatic scale, specified on standard input
 *  by their distance from concert A.
 *
 *  % java PlayThatTune < elise.txt
 *
 *
 *  Data files
 *  ----------
 *  http://www.cs.princeton.edu/introcs/21function/elise.txt
 *  http://www.cs.princeton.edu/introcs/21function/99luftballons.txt
 *  http://www.cs.princeton.edu/introcs/21function/freebird.txt
 *  http://www.cs.princeton.edu/introcs/21function/Ascale.txt
 *  http://www.cs.princeton.edu/introcs/21function/National_Anthem.txt
 *  http://www.cs.princeton.edu/introcs/21function/looney.txt
 *  http://www.cs.princeton.edu/introcs/21function/StairwayToHeaven.txt
 *  http://www.cs.princeton.edu/introcs/21function/entertainer.txt
 *  http://www.cs.princeton.edu/introcs/21function/old-nassau.txt
 *  http://www.cs.princeton.edu/introcs/21function/arabesque.txt
 *  http://www.cs.princeton.edu/introcs/21function/firstcut.txt 
 *  http://www.cs.princeton.edu/introcs/21function/tomsdiner.txt
 *
 *************************************************************************/

public class PlayThatTune {

    public static void main(String[] args) {
    	
    	ArgsProcessor.useStdInput("music");
    	ArgsProcessor ap = new ArgsProcessor(args);
    	int factors = ap.nextInt("how many frequency factors ?");
    	int Num[]=new int[factors];
    	int Deno[]=new int[factors];
    	double RS[]=new double[factors];
    	for(int i=0;i<=factors-1;i++){
    		Num[i] = ap.nextInt("Numerator "+(i+1)+" ?");
    		Deno[i] = ap.nextInt("Denominator "+(i+1)+" ?");
    		RS[i]=ap.nextDouble("Relative strength "+(i+1)+" ?");
    	}
        // repeat as long as there are more integers to read in
        while (!StdIn.isEmpty()) {

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = StdIn.readInt();

            // read in duration in seconds
            double duration = StdIn.readDouble();

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];
            double[]sum=new double [N+1];
            for(int t=0;t<=factors-1;t++){
            for (int i = 0; i <= N; i++) {
                a[i] = RS[t]*Math.sin(2 * Math.PI * i * hz*((double)Num[t]/Deno[t]) / StdAudio.SAMPLE_RATE);
                sum[i]=sum[i]+a[i];
            }
            
            }
            // play it using standard audio
            StdAudio.play(sum);
        }
        StdDraw.setXscale(0, 1.0);
        StdDraw.setYscale(-3.0, 3.0);
        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(Color.black);
        double y=0;
        for(int i=0;i<=factors-1;i++){
        for(double x=0.001;x<1;x=x+0.004){
        	y=RS[i]*Math.sin(2 * Math.PI * x*((double)Num[i]/Deno[i]));
        	StdDraw.filledCircle(x, y, 0.005);
        }
        }
        StdDraw.setPenColor(Color.red);
        
        double []Y=new double[3];
        for(double x=0.001;x<1;x=x+0.0001){
        	double sum=0;
        for(int i=0;i<=factors-1;i++){
            	Y[i]=RS[i]*Math.sin(2 * Math.PI * x*((double)Num[i]/Deno[i]));
            	sum=sum+Y[i];
            }
        StdDraw.filledCircle(x, sum, 0.01);
        }
    }
}
