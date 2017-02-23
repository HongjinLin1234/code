package lab5;

public class Lab5Methods {
	/**
	 * 
	 * @param n the start number of sum
	 * @return the sum of the n down by two until 1 or 0
	 */
    public static int sumDownBy2(int n){
    	int sum=0;
    	if(n<0){sum=0;}
    	else{
    	for(int i=n;i>=0;i=i-2){
    		sum=sum+i;
    	}
    	}
    	return sum;
    }
    /**
	 * 
	 * @param n a positive integer
	 * @return the sum 1 + 1/2 + 1/3 + … + 1/(n-1) + 1/n
	 */
    public static double harmonicSum (int n){
    	double sum=0;
    	for(int i=1;i<=n;i++){
    		sum=sum+1/(double)i;
    	}
    	return sum;
    }
    /**
	 * 
	 * @param k a non-negative integer
	 * @return the sum 1 + 1/2 + 1/4 + 1/8 + … + 1/Math.pow(2,k)
	 */
    public static double geometricSum (int k){
    	double sum=0;
    	while(k >= 0){
    		sum += (1 / Math.pow(2, k));
    	k--;
    	}
    	
    	return sum;
    }
    /**
	 * 
	 * @param j a positive integer
	 * @param k a positive integer
	 * @return the product j*k
	 */
    public static int multPos (int j,int k) {
    	int sum=0;
    	for(int i=1;i<=k;i++){
    		sum=sum+j;
    	}
    	return sum;
    }
    /**
	 * 
	 * @param j an integer
	 * @param k an integer
	 * @return the product j*k
	 */
    public static int  mult (int j,int k){
    	int m=Math.abs(j);
    	int n=Math.abs(k);
    	int sum1=multPos(m,n);
    	
    	if((j<0)&&(k>0)){sum1=-sum1;}
    	else if((j>0)&&(k<0)){sum1=-sum1;}
    	
    	return sum1;
    	
    }
    /**
	 * 
	 * @param n an integer
	 * @param k a non-negative integer
	 * @return the value of n to the power k
	 */
    public static int expt (int n,int k){
    	int exp=1;
    	if(k==0){exp=1;}
    	else{
    		for(int i=1;i<=k;i++){
    			exp=exp*n;
    		}
    	}
    	return exp;
    	
    }

}
