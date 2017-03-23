package studio7;

public class Fraction {
    private int numerator;
    private int denominator;
    /**
     * 
     * @param numerator
     * @param denominator
     */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	 * 
	 * @param n1 another fraction's numerator
	 * @param d1 another fraction's denominator
	 */
	public void sum(int n1,int d1){
		numerator=numerator*d1+n1*denominator;
		denominator=d1*denominator;
	}
	/**
	 * 
	 * @param n1 another fraction's numerator
	 * @param d1 another fraction's denominator
	 */
	public void product(int n1,int d1){
		numerator=n1*numerator;
		denominator=d1*denominator;
	}
	/**
	 * take the reciprocal of itself
	 */
	public void reciprocal(){
		int t=0;
		t=numerator;
		numerator=denominator;
		denominator=t;
	}
	/**
	 * simplify itself
	 */
	public void simp(){
		if(numerator<denominator){
		for(int i=numerator;i>=2;i--){
			if((numerator%i==0)&&(denominator%i==0)){numerator=numerator/i;denominator=denominator/i;}
		}}
		if(numerator>denominator){
			for(int i=denominator;i>=2;i--){
				if((numerator%i==0)&&(denominator%i==0)){numerator=numerator/i;denominator=denominator/i;}
			}}
		if(numerator==denominator){numerator=1;denominator=1;}
	}
	/**
	 * output a string type
	 */
	 public String toString() {
	 		return this.numerator+"/"+this.denominator;
	 }
	 /**
	  * 
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fraction r=new Fraction(24,24);
        r.simp();
        r.product(2, 3);
        r.simp();
        r.reciprocal();
        r.simp();
        r.sum(2, 3);
        r.simp();
        System.out.println(r);
	}

}
