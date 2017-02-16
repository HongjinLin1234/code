package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		while(!StdDraw.mousePressed()){StdDraw.pause(100);}
			System.out.println("pressed");
		
		while(StdDraw.mousePressed()){StdDraw.pause(100);}
		    StdDraw.setPenRadius(0.01);
			StdDraw.point(StdDraw.mouseX(),StdDraw.mouseY());
			char gotkey=' ';
			while(gotkey!='q'){
			while(!StdDraw.hasNextKeyTyped()){StdDraw.pause(100);}
			gotkey=StdDraw.nextKeyTyped();
			}
		// wait for the mouse to be pressed and released

		// here, the mouse has been pressed

		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		
		
		// here, a q has been typed
		
		
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

}
