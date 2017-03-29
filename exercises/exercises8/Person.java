package exercises8;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private final List<Valuable> asserts;
    public Person(){
    	this.asserts=new LinkedList<Valuable>();;
    }
    public void addAssert(Valuable v){
    	asserts.add(v);
    }
    public int getWorth() {
		// TODO Auto-generated method stub
		int sum=0;
		for(Valuable v:asserts){
			sum=sum+v.getLiquidValue();
		}
		return sum;
	}
    public List<Valuable> getAsserts(){
    	return this.asserts;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p=new Person();
       p.addAssert(new BankAccount(1000));
       StockHolding s=new StockHolding("IBM","Ron",131);
       s.setNumShares(100);
       p.addAssert(s);
       PersonalProperty pp=new PersonalProperty(100000);
       p.addAssert(pp);
       for(int i=0;i<10;i++){
    	   pp.yearOlder();
       }
       System.out.println("Asserts: "+p.getAsserts());
       System.out.println("Person is worth: "+p.getWorth());
       pp.yearOlder();
       System.out.println("Person is worth(1 y later): "+p.getWorth());
	}
	

}
