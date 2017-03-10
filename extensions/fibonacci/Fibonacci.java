package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if(n<=1){
			 return n;
		 }
		 else{
			 return recursive(n-1)+recursive(n-2)
;
		 } // FIXME
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		if(n==0){return 0;}
		else if(n==1){return 1;}
		else{
		int a[]=new int [n+1];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++){
			a[i]=a[i-1]+a[i-2];
		}
		return a[n];}
		// FIXME
	}

}
