package exercises6;

public class FactorialNoBaseCase {
	
	public static int factorial(int n) {
		if(n<=1){return 1;}
		else
		{return n * factorial(n-1);}
	}

	public static void main(String[] args) {
		int ans = factorial(3);
		System.out.println("Answer is " + ans);
	}
}
