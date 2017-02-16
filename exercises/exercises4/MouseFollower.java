package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("How much history?");
		double[]hisx=new double[N];
		double[]hisy=new double[N];
		StdDraw.setPenColor(Color.CYAN);
		int cur=0;
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
            double x=StdDraw.mouseX();
            double y=StdDraw.mouseY();
            hisx[cur]=x;
            hisy[cur]=y;
            cur=cur+1;
            if(cur>=hisx.length){cur=0;}
            StdDraw.filledCircle(hisx[cur], hisy[cur], 0.05);
			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
