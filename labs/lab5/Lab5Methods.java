package lab5;

public class Lab5Methods {
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
    public static double harmonicSum (int n){
    	double sum=0;
    	for(int i=1;i<=n;i++){
    		sum=sum+1/(double)i;
    	}
    	return sum;
    }
    public static double geometricSum (int k){
    	double sum=0;
    	while(k >= 0){
    		sum += (1 / Math.pow(2, k));
    	k--;
    	}
    	
    	return sum;
    }
    public static int multPos (int j,int k) {
    	int sum=0;
    	for(int i=1;i<=k;i++){
    		sum=sum+j;
    	}
    	return sum;
    }
    public static 

}
