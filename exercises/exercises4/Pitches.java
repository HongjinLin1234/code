package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
        ArgsProcessor ap=new ArgsProcessor(args);
        int pitch1=ap.nextInt("What pitch?");
        int pitch2=ap.nextInt("Pitch 2?");
        double frequency2=440.0*Math.pow(2, pitch2/12.0);
        double frequency1=440.0*Math.pow(2, pitch1/12.0);
        //System.out.println("For pitch "+pitch1);
        //System.out.println("We get frequency "+frequency1);
        //System.out.println("Up a diatonic fifth "+frequency2);
        double ratio=frequency2/frequency1;
        System.out.println("Ratio is "+ratio);
	}

}
