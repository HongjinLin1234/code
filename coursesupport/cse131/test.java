package cse131;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int a = ap.nextInt("Value for a?");  
		int b = ap.nextInt("Value for b?");  
		int c = ap.nextInt("Value for c?"); 
		boolean twoequal=true;
		twoequal=((a==b)&&(b!=c))||((b==c)&&(a!=c))||((c==a)&&(a!=b));
		System.out.println(twoequal);
		
	}

}
