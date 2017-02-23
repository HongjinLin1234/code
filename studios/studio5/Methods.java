package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return 1;  // FIXME
	}
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @param z the last factor
	 * @param sum the sum of 3 factors
	 * @param avg the average of 3 factors
	 * @return the average of the factors
	 */
	public static double avg3(int x,int y,int z){
        int sum=x+y+z;
        double avg=sum/3.0;
        return avg;
}
	/**
	 * 
	 * @param array[] the array to sum
	 * @return the sum of the array
	 */
    public static double sumArray(double array[]){
    	double sum=0;
    	for(int i=0;i<array.length;i++){
    		sum=sum+array[i];
    	}
    	return sum;
    }
    /**
	 * 
	 * @param array[] the array to sum
	 * @return the average of the array
	 */
    public static double average(double array[]){
    	double sum=sumArray(array);
    	double average=sum/(double)array.length;
    	return average;
    }
    /**
	 * 
	 * @param x one factor
	 * @param y the other factor
	 * @return d the division of x and y
	 */
    public static double division(int x,int y){
    	double d=(double)x/(double)y;
    	return d;
    }
    /**
	 * 
	 * @param s one string
	 * @return s1 the transformation of s
	 */
    public static String pig(String s){
    	String s1="";
    	s1=s.substring(1)+s.substring(0,1)+"ay";
    	return s1;
    }
}

