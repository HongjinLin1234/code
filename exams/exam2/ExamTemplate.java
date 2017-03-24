package exam2;

import sedgewick.StdDraw;

public class ExamTemplate {
	public static void main(String[] args) {
		//Yes, this is supposed to be blank
		System.out.println(koch(1));
		System.out.println(dragon(2));
		System.out.println(computeScale(koch(1)));
		System.out.println(computeScale(dragon(1)));
		drawLString(koch(4));
		//Use this method to test the methods that we ask you
		//to write
	}
	
	//The methods that we ask you to write should go here
	public static String koch(int n){
		if(n==0){return "F";}
		else
			{return koch(n-1).replaceAll("F", "F+F-F-F+F");}
	}
	public static String dragon(int n){
		String D[]=new String[n+1];
    	D[0]="F-H";
    	for(int i=1;i<=n;i++){
    		D[i]=D[i-1].replaceAll("F", "f-h");
    		D[i]=D[i].replaceAll("H", "f+h");
    		D[i]=D[i].replaceAll("f", "F");
    		D[i]=D[i].replaceAll("h", "H");
    	}
    	return D[n];
	}
	public static double computeScale(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='F'){count=count+1;}
			if(s.charAt(i)=='H'){count=count+1;}
		}
		return 1/(2*Math.sqrt(count));
	}
	public static void drawLString(String lString){
		double X=0.5;
		double Y=0.5;
		int x=1;
		int y=0;
		int t=0;
		StdDraw.line(X, Y, X+x*computeScale(lString), Y+y*computeScale(lString));
		X=X+x*computeScale(lString);
		Y=Y+y*computeScale(lString);
		for(int i=0;i<lString.length();i++){
			if(lString.charAt(i)=='+'){
				t=x;
				x=-y;
				y=t;
				StdDraw.line(X, Y, X+x*computeScale(lString), Y+y*computeScale(lString));
				X=X+x*computeScale(lString);
				Y=Y+y*computeScale(lString);
			}
		
			if(lString.charAt(i)=='-'){
				t=x;
				x=y;
				y=-t;
				StdDraw.line(X, Y, X+x*computeScale(lString), Y+y*computeScale(lString));
				X=X+x*computeScale(lString);
				Y=Y+y*computeScale(lString);
			}
		
	}
}
}
