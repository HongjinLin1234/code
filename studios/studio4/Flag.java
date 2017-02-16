package studio4;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) throws FileNotFoundException {
		//
		//  Add code for your studio below here.
		//
		
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.46, 0.31);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0.5, 0.725, 0.45, 0.075);
		StdDraw.filledRectangle(0.5, 0.275, 0.45, 0.075);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(0.5, 0.6, 0.4, (0.5-0.1/Math.sqrt(3)));
		StdDraw.line(0.4, (0.5-0.1/Math.sqrt(3)),0.6, (0.5-0.1/Math.sqrt(3)));
		StdDraw.line(0.6, (0.5-0.1/Math.sqrt(3)),0.5,0.6);
		StdDraw.line(0.4, (0.5+0.1/Math.sqrt(3)), 0.6, (0.5+0.1/Math.sqrt(3)));
		StdDraw.line(0.6, (0.5+0.1/Math.sqrt(3)), 0.5, 0.4);
		StdDraw.line(0.5,0.4,0.4,(0.5+0.1/Math.sqrt(3)));
		StdDraw.setPenColor(Color.red);
		for(double i=0;i<=1;i=i+0.1){
		StdDraw.text(i, 1-i, "Israel");
		StdDraw.show(1000);
		}
		while(true){
		System.setIn(new FileInputStream("music/National_Anthem.txt"));

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
            for (int i = 0; i <= N; i++) {
                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            }

            // play it using standard audio
           
            StdAudio.play(a);
            
            }
}
            
           }
}

			
        
		
	

	
	


