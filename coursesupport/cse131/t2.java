package cse131;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int a = ap.nextInt("Value for a?"); 
		int b = ap.nextInt("Value for b?"); 
		int c = ap.nextInt("Value for c?");
        boolean order=true;
        order=((a<b)&&(b<c))||((a>b)&&(b>c));
        System.out.println(order);
	}

}
