package studio6;

public class Methods {

	// Your methods go below this line
	/**
	 * 
	 * @param n one factor
	 * @return the n!
	 */
	 public static int fact(int n){
	    if (n<=0){
	    	return 1;
	    }
	    else{
	    	return n*fact(n-1)	;
	    }
}
	 /**
		 * 
		 * @param n one factor
		 * @return  fib(n)=fib(n-1)+fib(n-2);	n>1
			        n;	otherwise
		 */
	 public static int fib(int n){
		 if(n<=1){
			 return n;
		 }
		 else{
			 return fib(n-1)+fib(n-2)
;
		 }
	 }
	 /**
		 * 
		 * @param n one factor
		 * @return if n is odd or not
		 */
	 public static boolean isOdd(int n){
		 if(n<=0){
			 return false;
		 }
		 else{
			 return !isOdd(n-1);
		 }
	 }
	 /**
		 * 
		 * @param a one factor
		 * @param b another factor
		 * @return the sum of the factors
		 */
	 public static int sum(int a, int b){
		 if(b>0){
			 return sum(a+1,b-1);
		 }
		 else{
			 return a;
		 }
	 }
	 /**
		 * 
		 * @param n one factor
		 * @return n + (n-2) + (n-4) + ... 
		 */
	 public static int sumDownBy2(int n){
		 if(n==0){
			 return 0;
		 }
		 if(n==1){
			 return 1;
		 }
		 else{
			 return n+sumDownBy2(n-2);
		 }
	 }
	 /**
		 * 
		 * @param n one factor
		 * @return 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
		 */

	 public static double harmonicSum(int n){
		 if(n<=1){
			 return 1;
		 }
		 else{
			 return (harmonicSum(n-1)+1/(double)n);
		 }
	 }
	 /**
		 * 
		 * @param a one factor
		 * @param b another factor
		 * @return the product of the factors
		 */
	 public static int mult(int a,int b){
		 if(b<=0){
			 return 0;
		 }
		 else{
			 return a+mult(a,b-1);
		 }
	 }
}
