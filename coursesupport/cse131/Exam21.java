package cse131;

public class Exam21 {
	public static int[] reverse(int[] array){
		int t=0;
		for(int i=0;i<array.length/2;i++){
			t=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=t;
		}
		return array;
	}
	public static int[] reverse1(int[] a){
	    int index=0;
	    return reversehelper(a,index);
	   
	}
	private static int[] reversehelper(int[] a,int index){
		if(index>=a.length/2){
			return a;
		}
		int t=a[index];
		a[index]=a[a.length-1-index];
		a[a.length-1-index]=t;
		return reversehelper(a,index+1);
	}
	public static int numDigits(int x){
		if(x<10){return 1;}
		return numDigits(x/10)+1;
	}
	public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	reverse1(a);
	for(int i=0;i<a.length;i++){
	System.out.print(a[i]+" ");}
	System.out.println();
	System.out.println(numDigits(1234567));
	
}
}
