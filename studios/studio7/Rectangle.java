package studio7;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    /**
     * 
     * @param length 
     * @param width
     */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.area=0;
		this.perimeter=0;
	}
    /**
     * 
     * @return the area
     */
	public double getArea() {
		return width*length;
	}
    /**
     * 
     * @return the perimeter
     */
	public double getPerimeter() {
		return 2*(width+length);
	}
	/**
	 * 
	 * @return if it is a square or not
	 */
     public boolean ifissquare(){
    	 if(length==width){ return true;}
    	 else{return false;}
     }
     /**
      * 
      * @param a the length of another rectangle
      * @param b the width of another rectangle
      * @return if it is smaller than the target rectangle
      */
     public boolean smaller(double a,double b){
    	 if(length*width<a*b){return true;}
    	 else{return false;}
     }
     /**
      * get the toString work
      */
     public String toString() {
 		return "The area is "+getArea()+" , the perimeter is "+getPerimeter();
 	}
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(5.2,6.2);
		System.out.println(r1);
		System.out.println("Is it a square? "+r1.ifissquare());
		System.out.println("Smaller than the rectangle of 2.2 and 3.2? "+r1.smaller(2.2, 3.2));
		
	}

}
