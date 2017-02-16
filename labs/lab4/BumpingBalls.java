package lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class BumpingBalls {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArgsProcessor ap = new ArgsProcessor(args);
    	int ball = ap.nextInt("How many balls?");
    	int t=ap.nextInt("How many iterations?");
    	StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double rx[]=new double[ball];
        double ry[]=new double[ball];
        double vx[]=new double[ball];
        double vy[]=new double[ball];
        for(int i=0;i<=ball-1;i++){
        	rx[i]=Math.random()*1.9-0.95;
        	ry[i]=Math.random()*1.9-0.95;
        	vx[i]=Math.random()*0.02-0.01;
        	vy[i]=Math.random()*0.02-0.01;
        }
        double radius = 0.05;
        int k=0;
        while(k<=t){
        	for(int i=0;i<=ball-1;i++){
        	if (Math.abs(rx[i] + vx[i]) > 1.0 - radius) {vx[i] = -vx[i];}
        	if (Math.abs(ry[i] + vy[i]) > 1.0 - radius) {vy[i] = -vy[i];}}
        	
   
        	for(int i=0;i<=ball-2;i++){
        		for(int j=i+1;j<=ball-1;j++){
        			if(Math.pow((rx[i]-rx[j]+vx[i]-vx[j]),2)+Math.pow((ry[i]-ry[j]+vx[i]-vy[j]), 2)<=4*Math.pow(radius, 2)){
        				vx[i]=-vx[i];
        				vx[j]=-vx[j];
        				vy[i]=-vy[i];
        				vy[j]=-vy[j];
        			
        			}
        		}
        		
        	}
        	for(int a=0;a<=ball-1;a++){
        		rx[a] = rx[a] + vx[a]; 
                ry[a] = ry[a] + vy[a];
                if(rx[a]>0.95){
                	rx[a]=0.95;
                }
                if(ry[a]>0.95){
                	ry[a]=0.95;
                }
        	}
        	StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);
            StdDraw.setPenColor(StdDraw.BLACK); 
            for(int a=0;a<=ball-1;a++){
            StdDraw.filledCircle(rx[a], ry[a], radius);}
            StdDraw.show(10);
            k=k+1;
        }
	}

	}
