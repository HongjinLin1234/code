package studio7;

public class Complex {
    private int a;
    private int b;
    /**
     * 
     * @param a  real part 
     * @param b  imaginary part 
     */
	public Complex(int a, int b) {
		this.a = a;
		this.b = b;
	}
	/**
	 * 
	 * @param c real part of another complex
	 * @param d imaginary part of another complex
	 */
	public void sum(int c,int d){
		a=a+c;
		b=b+d;
	}
	/**
	 * 
	 * @param c real part of another complex
	 * @param d imaginary part of another complex
	 */
	public void product(int c,int d){
		a=a*c-b*d;
		b=a*d+b*c;
	}
	/**
	 * get the toString work
	 */
	public String toString() {
 		if(b>0){return a+"+"+b+"i";}
 		else if(b<0){return a+"-"+(-b)+"i";}
 		else if(b==0){return a+"";}
 		else if(a==0){return b+"i";}
 		else{return a+"+"+b+"i";}
 		}
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Complex r=new Complex(1,2);
        System.out.println(r);
        r.sum(3, 4);
        System.out.println(r);
        r.product(3, 4);
        System.out.println(r);
	}

}
