package studio3;

import cse131.ArgsProcessor;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("the size of the array?");
		int a[]=new int[n];
		a[0]=2;
		int k=1;
		int j=1;
		int flag=0;
		for(int i=3;i<=n;i++){
			flag=0;
			for(j=2;j<=i-1;j++){
				if(i%j==0){
					flag=1;
				}
			}
			if(flag==0){a[k]=i;k=k+1;}
			
		}
		System.out.print("Primes under "+n+" = ");
		for(int b=0;b<=k-1;b++){
			System.out.print(" "+a[b]+" ");
		}
}
}
		

	


