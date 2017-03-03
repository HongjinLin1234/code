package lab6;

import java.awt.Color;

import sedgewick.StdDraw;


public class Triangles {
	public static void t(double a,double b,double size){
		StdDraw.setPenColor(Color.white);
		if (size < .02) {
			return;} 
		double lx[]={a,a-size/2,a+size/2};
		double ly[]={b,b+size*Math.sqrt(3)/2,b+size*Math.sqrt(3)/2};
		StdDraw.filledPolygon(lx, ly);
		t(a,b+size*Math.sqrt(3)/2,size/2);
		t(a-size/2,b,size/2);
		t(a+size/2,b,size/2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[]={0.5,0.5-0.2*Math.sqrt(3),0.5+0.2*Math.sqrt(3)};
		double y[]={0.9,0.3,0.3};
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.filledPolygon(x, y);
        t(0.5,0.3,0.2*Math.sqrt(3));
	}

}
