package lab8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Polynomial {

	final private LinkedList<Double> list;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//
		this.list=new LinkedList<Double>();
		
		// FIXME
	}

	public String toString() {
		int I=list.size();
		if(I>0){
		String s[]=new String[list.size()];
		String k="";
		for(int i=0;i<=list.size()-2;i++){
			s[i]=list.get(i)+"x^"+i+"+";
		}
		s[list.size()-1]=list.get(list.size()-1)+"x^"+(list.size()-1);
		for(int i=0;i<=list.size()-1;i++){
			k=k+s[i];
		}
		return k;}
		else{return "0";}
	}

	public Polynomial addTerm(double coeff) {
		//
		// FIXME
		//
		this.list.add(coeff);
		return this;  // required by lab spec
	}

	public double evaluate(double x) {
		int i=0;
		return evaluatehelper(x,i);
	}
	private double evaluatehelper(double x,int i){
		int I=list.size();
		if(I>0){
		if(i==(list.size()-1)){return (list.get(i));}
		else{return list.get(i)+x*evaluatehelper(x,i+1);}}
		else{return 0;}
	}
	public Polynomial derivative() {
		int I=list.size();
		Polynomial f=new Polynomial();
		if(I>0){
		double t[]=new double[list.size()-1];
		for(int i=0;i<=list.size()-2;i++){
            t[i]=(list.get(i+1))*(i+1);
		}
		for(int i=0;i<=list.size()-2;i++){
		f.addTerm(t[i]);
		}
		
		
		
		return f;}
		else
		{return this;}
	}
	
	public Polynomial sum(Polynomial another) {
		int I=list.size();
		if(I>0){
			Polynomial f=new Polynomial();
		double t[]=new double[Math.max(this.list.size(), another.list.size())];
		for(int i=0;i<=Math.max(this.list.size()-1, another.list.size()-1);i++){
		 if((i<=this.list.size()-1)&&(i<=another.list.size()-1)){t[i]=another.list.get(i)+this.list.get(i);}
		 else if((i<=this.list.size()-1)&&(i>another.list.size()-1)){t[i]=this.list.get(i);}
		 else if((i<=another.list.size()-1)&&(i>this.list.size()-1)){t[i]=another.list.get(i);}
		 f.addTerm(t[i]);
	}
		return f;
	}
		else
		{return another;}
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}
	public static void main(String[] args) {
		 Polynomial foo = new Polynomial();
		 foo.addTerm(4);
		 foo.addTerm(-7);
		 foo.addTerm(0);
		 foo.addTerm(11);
		 Polynomial fo = new Polynomial();
		 fo.addTerm(-1);
		 fo.addTerm(2);
		 fo.addTerm(3);
		 fo.addTerm(-4);
		 fo.addTerm(5);
		 System.out.println(foo.evaluate(2.0));
		 System.out.println(fo.sum(foo));
	}
}
