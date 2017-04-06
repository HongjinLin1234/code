package studio9;

import java.util.Iterator;

public class DoublyLinkedListOfInts implements IntList{
	private ListItem head;
	private ListItem tail;
	public DoublyLinkedListOfInts(){
		ListItem s1=new ListItem(7,null,null);
		ListItem s2=new ListItem(6,null,s1);
		s1.setNext(s2);
		this.head=s1;
		this.tail=s2;
	}
	public String toString() {
		String ans = "[";
		// put the stuff in
		// this could be a "while" loop but let's use for
		//
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			ans = ans + p.getValue() + " ";
		}
		ans = ans + "]";
		return ans;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFirst(int item) {
		// TODO Auto-generated method stub
		ListItem q=this.head.getNext();
		ListItem newbie = new ListItem(item, this.head.getNext(),this.head);
		this.head.setNext(newbie);
		if(newbie.getNext()==tail){this.tail.setPrev(newbie);}
		else{q.setPrev(newbie);}
	}

	@Override
	public void addLast(int item) {
		// TODO Auto-generated method stub
		ListItem q=this.tail.getPrev();
		ListItem newbie = new ListItem(item, this.tail,this.tail.getPrev());
		this.tail.setPrev(newbie);
		if(newbie.getPrev()==head){this.head.setNext(newbie);}
		else{q.setNext(newbie);}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int ans=0;
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			ans = ans + 1;
		}
		return ans;
	}

	@Override
	public int indexOf(int item) {
		// TODO Auto-generated method stub
		int ans=-1;
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			ans=ans+1;
			if(p.getValue()==item){return ans;}
		}
		return -1;
	}

	@Override
	public boolean remove(int item) {
		// TODO Auto-generated method stub
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			if(p.getValue()==item){
				ListItem q=p.getNext();
				ListItem o=p.getPrev();
				o.setNext(q);
				q.setPrev(o);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public IntList reverse(){
		DoublyLinkedListOfInts q=new DoublyLinkedListOfInts();
		for (ListItem p = this.tail.getPrev(); p != this.head; p = p.getPrev()) {
			q.addLast(p.getValue());
		}
		return q;
	}
	public static void main(String[] args) {
		DoublyLinkedListOfInts p=new DoublyLinkedListOfInts();
		p.addFirst(7);
		p.addFirst(6);
		p.addFirst(15); 
		p.addLast(16);
		System.out.println(p);
		System.out.println(p.reverse());
		System.out.println(p.size());
		System.out.println(p.indexOf(7));
		System.out.println(p.remove(7));
		System.out.println(p);
		System.out.println(p.reverse());
	}
}
