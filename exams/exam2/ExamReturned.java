package linhongjinexam2;

import sedgewick.StdDraw;


/* 
* Compile Error Deductions: 
* __ [-1] Needed to fix a compilation problem in the code
*/  

public class ExamReturned { 
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

/* Question 1: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+5] Correct method signature: public static String koch(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* __ [+5] "Correctly identifies the base case - when n==0 returns ""F"""
* __ [+5] "When n > 0 gets koch(n-1)"
* __ [+5] "When n > 0  replaces F's in koch(n-1) with ""F+F-F-F+F"""
*/

	public static String koch(int n){
		if(n==0){return "F";}
		else
			{return koch(n-1).replaceAll("F", "F+F-F-F+F");}
	}

/* Question 2: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+4] Correct method signature: public static String dragon(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* __ [+4] "Declares an initial dragonString (name doesn't matter) that equals ""F-H"""
* __ [+4] Uses a for loop i = o; i < n or equivalent while loop 
* __ [+4] Replaces F's with F-H and H's with F+H
* __ [+4] "When replacing F's and H's avoids incorrect additions (e.g. F-H becomes F-H - F+H NOT F-F+H -F+H OR F-H-F-H+H)"
*/

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

/* Question 3: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+4] Correct method signature: public static double computeScale(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* __ [+4] Uses a loop i = 0; i < lString.length() or equivalent while loop
* __ [+4] Uses charAt(i) to get the ith character in the string within the loop
* __ [+4] "When character is either an F or an H adds 1 to a count variable (name substitutions are fine)"
* __ [+4] Returns 1/(2*Math.sqrt(count)) with parentheses that ensure the correct order of operations
*/

	public static double computeScale(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='F'){count=count+1;}
			if(s.charAt(i)=='H'){count=count+1;}
		}
		return 1/(2*Math.sqrt(count));
	}

/* Question 4: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+3] Correct method signature: public static void drawLString(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* __ [+3] Calls computeScale to get the scale value
* __ [+3] Uses a loop i = 0; i < lString.length() or equivalent while loop
* __ [+3] Uses charAt(i) to get the ith character in the string within the loop
* __ [+3] Maintains x and y directions that are used within the StdDraw.line call
* __ [+3] Uses one or more if statement/if-else statements to draw lines for F or H characters
* __ [+3] Uses one or more if statement/if-else statements to change x and y directions for + and - characters
*/

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
