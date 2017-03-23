package studio7;

public class Die {
    private int n;
  /**
   * 
   * @param n
   */
	public Die(int n) {
		this.n = n;
	}
	/**
	 * 
	 * @return the random integer from 1~n
	 */
	public int getinteger(){
		return (int)(n*Math.random()+1);
	}
	 public String toString() {
		 return "The integer is "+getinteger();
}
	 /**
	  * 
	  * @param args
	  */
	 public static void main(String[] args) {
		 Die r=new Die(5);
		 System.out.println(r);
	 }
}
