package cse131;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int X = ap.nextInt("Value for X?");  
		double[][] arr = new double[X][X];
		double c[]=new double [X];
		for(int i=0;i<=X-1;i++){
			for(int j=0;j<=X-1;j++){
			arr[i][j]=(double)Math.round(Math.random()*10)/10; System.out.print(arr[i][j]+"  ");}
			System.out.println();
		}
		System.out.println();
		for(int j=0;j<=X-1;j++){
			
			for(int i=0;i<=X-1;i++){
				c[j]=(double)Math.round((c[j]+arr[i][j])*10)/10;
			}
			System.out.print(c[j]+"  ");
		}
		System.out.println();
		double sum=0;
		for(int i=0;i<=X-1;i++){
			sum=(double)Math.round((sum+arr[i][i])*10)/10;
		}
		System.out.println("The sum of diagonal is "+sum);
	}

}
