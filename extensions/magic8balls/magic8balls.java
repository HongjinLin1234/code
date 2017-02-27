package magic8balls;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;

public class magic8balls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int a=ap.nextInt("How many questions?");
		int time=0;
        while (time<=a-1){
        	String s=ap.nextString("Your question?");
        	double x[]={0.5,(0.5-0.1*Math.sqrt(3)),(0.5+0.1*Math.sqrt(3))};
        	double y[]={0.3,0.6,0.6};
        	StdDraw.setPenColor(Color.black);
        	StdDraw.filledCircle(0.5, 0.5, 0.4);
        	StdDraw.pause(1000);
        	for(int i=0;i<=255;i++)
        	{
        		StdDraw.setPenColor(new Color(0,0,i));
        		StdDraw.filledPolygon(x, y);
        	}
        	StdDraw.pause(1000);
        	double k=3*Math.random();
        	if((k>0)&&(k<1)){
        		for(int i=0;i<=255;i++)
            	{
        		StdDraw.setPenColor(new Color(0,i,0));
        		StdDraw.text(0.5, 0.5, "It is certain!");}
        		StdAudio.play("sound/elaugh.au");
        	}
        	if ((k>1)&&(k<2)){
        		for(int i=0;i<=255;i++)
            	{
        		StdDraw.setPenColor(new Color(i,i,0));
        		StdDraw.text(0.5, 0.5, "Ask again later");}
        		StdAudio.play("sound/boink.au");
        	}
        	if ((k>2)&&(k<3))
        	{   for(int i=0;i<=255;i++)
        	   {
        		StdDraw.setPenColor(new Color(i,0,0));
        		StdDraw.text(0.5, 0.5, "My reply is no");}
        	StdAudio.play("sound/bonk01.au");
        	}
        	
        	StdDraw.pause(1000);
        	time=time+1;
        }
	}

}
