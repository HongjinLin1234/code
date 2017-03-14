package Eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		double[]ex=new double[N];
		double[]ey=new double[N];
		double[]rx=new double[N];
		double[]ry=new double[N];
		for(int i=0;i<=N-1;i++){
			while(!StdDraw.mousePressed()){StdDraw.pause(10);}
			while(StdDraw.mousePressed()){
				StdDraw.setPenRadius(0.01);
				StdDraw.setPenColor(Color.black);
				StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 0.03);
				StdDraw.setPenColor(Color.white);
				StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.03);
				ex[i]=StdDraw.mouseX();
				ey[i]=StdDraw.mouseY();
			}
		}
		
		while(true){
			
			for(int j=0;j<=N-1;j++){
				double d=Math.sqrt(Math.pow(ex[j]-StdDraw.mouseX(), 2)+Math.pow(ey[j]-StdDraw.mouseY(), 2));
				double dx=StdDraw.mouseX()-ex[j];
				double dy=StdDraw.mouseY()-ey[j];
				double p=0.02;
				double px=p*dx/d;
				double py=p*dy/d;
				rx[j]=ex[j]+px;
				ry[j]=ey[j]+py;}
			StdDraw.setPenColor(Color.white);
			for(int j=0;j<=N-1;j++){
				StdDraw.filledCircle(ex[j], ey[j], 0.03);
				}
			StdDraw.setPenColor(Color.red);
			for(int j=0;j<=N-1;j++){
				StdDraw.filledCircle(rx[j], ry[j], 0.01);
				}
			StdDraw.show(10);
			
			
			}
		}
	}


