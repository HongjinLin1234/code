package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//
	/**
	 * 
	 * @param x one factor
	 * @return f f(x)
	 */
	public static int f(int x){
		if (x > 100){
			return x-10;
		}
		else{
			return f(f(x+11));
		}
	      
	}
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return g g(x,y)
	 */
	public static int g(int x,int y){
		if(x==0){
			return y+1;
		}
		else if((x>0)&&(y==0)){
			return g(x-1,1);
		}
		else if((x>0)&&(y>0)){
			return g(x-1, g(x, y-1));
		}
		else
		{return 0;}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		System.out.println("f(99)="+f(99));
		System.out.println("f(87)="+f(87));
		System.out.println("f(1)="+f(1));
		System.out.println("f(20)="+f(20));
		System.out.println();
		System.out.println("g(1,0)="+g(1,0));
		System.out.println("g(1,2)="+g(1,2));
		System.out.println("g(2,2)="+g(2,2));
		
	}

}
