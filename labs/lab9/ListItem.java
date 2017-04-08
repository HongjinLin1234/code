package lab9;

import studio9.ListItem;

public class ListItem {
	//
	// Important:  Do NOT make these instance variables private
	// Our testing needs to be able to access them, so leave their
	//   declarations as you see them below.
	//
	final int number;
	ListItem next;

	/**
	 * Creates a single list item.
	 * @param number the value to be held in the item
	 * @param next a reference to the next item in the list
	 */
	ListItem (int number, ListItem next) {
		this.number = number;
		this.next   = next;
	}
     
	

	/**
	 * Return a copy of this list using recursion.  No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact -- this method must not mutate anything.
	 * @return
	 */
	public ListItem duplicate() {
		ListItem p=new ListItem(this.number,this.next);
		if(p.next!=null){return new ListItem(p.number,p.next.duplicate());}
		else{return new ListItem(p.number,null);}
		
		// FIXME
	}

	/**
	 * Recursively compute the number of elements in the list. No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact.
	 * @return
	 */
	public int length() {
		ListItem p=new ListItem(this.number,this.next);
		if(p.next!=null){return 1+p.next.length();}
		else{return 1;}
	}

	/**
	 * Return a new list, like duplicate(), but every element
	 * appears n times instead of once.  See the web page for details.
	 * You must do this method iteratively.  No credit
	 * if you use any recursion!
	 * @param n a positive (never 0) number specifying how many times to copy each element
	 * @return
	 */

	public ListItem stretch(int n) { 
		ListItem q=new ListItem(this.number,this.next);
		int k[]=new int [this.length()];
		ListItem g[]=new ListItem[this.length()*n];
		int i=0;
				for(ListItem p= this; p!= null; p=p.next){
					k[i]=p.number;
					i=i+1;
		}
		 for(int j=0;j<=this.length()*n-1;j++){
			 
		}
		return g;  // FIXME
	}

	/**
	 * Return the first ListItem, looking from "this" forward,
	 * that contains the specified number.  No lists should be
	 * modified as a result of this call.  You may do this recursively
	 * or iteratively, as you like.
	 * @param n
	 * @return
	 */

	public ListItem find(int n) {
		for(ListItem p= this; p!= null; p=p.next){
			if(p.number==n){return p;}
		}
		return null;
	}

	/**
	 * Return the maximum number contained in the list
	 * from this point forward.  No lists should be modified
	 * as a result of this call.  You may do this method recursively
	 * or iteratively,as you like.
	 * @return
	 */

	public int max() {
		int max=this.number;
		for(ListItem p= this; p!= null; p=p.next){
			if(p.number>=max){max=p.number;}
		}
		return  max; // FIXME
	}

	/**
	 * Returns a copy of the list beginning at ls, but containing
	 * only elements that are even.
	 * @param ls
	 * @return
	 */

	public static ListItem evenElements(ListItem ls) {
		if(ls==null){return null;}
		else if((ls.next!=null)&&(ls.number%2==0)){return new ListItem(ls.number,evenElements(ls.next));}
		else if((ls.next==null)&&(ls.number%2==0)){return new ListItem(ls.number,null);}
		else if((ls.next!=null)&&(ls.number%2!=0)){return evenElements(ls.next);}
		else{return null;}
		
	}	


	/**
	 * Returns a string representation of the values reachable from
	 * this list item.  Values appear in the same order as the occur in
	 * the linked structure.  Leave this method alone so our testing will work
	 * properly.
	 */
	public String toString() { 
		if (next == null)
			return ("" + number);
		else
			return (number + " " + next); // calls next.toString() implicitly
	}
	public static void main(String[] args) {
		ListItem k1=new ListItem(5,null);
		ListItem k2=new ListItem(6,k1);
		ListItem k3=new ListItem(7,k2);
		ListItem k4=new ListItem(8,k3);
		System.out.println(k4);
		System.out.println(k4.length());
		System.out.println(k4.duplicate());
		System.out.println(k4.stretch(2));
		System.out.println(evenElements(null));
	}
}
