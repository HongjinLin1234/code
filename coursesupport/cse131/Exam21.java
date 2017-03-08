package cse131;

public class Exam21 {
	public static void reverse( int[] array ){
		int t=0;
		for(int i=0;i<array.length/2;i++){
			t=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=t;
		}
	}
	public static void reverse1( int[] array,int n){
			   int t=0;
			   t=array[n];
			   array[n]=array[array.length-1-n];
			   array[array.length-1-n]=t;
			   for(int i=n-1;i>(n+1)/2;i--){
			   reverse1(array,i);}  
	   
	}
	public static void main(String[] args) {
	int a[]={1,2,3};
	reverse(a);
	reverse1(a,2);
	for(int i=0;i<=2;i++){
	System.out.println(a[i]);}
	
}
}
