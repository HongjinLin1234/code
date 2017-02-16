package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.5, 0.25);
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.point(0.25, 0.5);
		// larger green point
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius();
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(0, 1, 0.5, 0);
		StdDraw.line(0.5, 0, 0, 0);
		// unfilled red triangle
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.75, 0.75, 0.1);
		// yellow circle, filled
        StdDraw.setPenColor(new Color(0,0,128));
        StdDraw.filledRectangle(0.25, 0.25, 0.2, 0.1);
		// filled blue rectangle
		


	}

}
