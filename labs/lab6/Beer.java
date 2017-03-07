package lab6;

public class Beer {
	/**
	 * 
	 * @param n number of bottles
	 * @return s the string of n bottles
	 */
	public static String bottlesOfBeer(int n){
		String s="";
		s="\n"+n+" bottles of beer on the wall, "+n+" bottles of beer; you take one down, pass it around, "+(n-1)+" bottles of beer on the wall.";
		if(n>1){
		s=s+bottlesOfBeer(n-1);}
		return s;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(bottlesOfBeer(5));
	}

}
