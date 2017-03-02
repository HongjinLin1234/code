package lab6;

public class Beer {
	public static String bottlesOfBeer(int n){
		String s="";
		while (n>0){
		s=s+"\n"+n+" bottles of beer on the wall, "+n+" bottles of beer; you take one down, pass it around, "+(n-1)+" bottles of beer on the wall.";
		n=n-1;}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(bottlesOfBeer(5));
	}

}
