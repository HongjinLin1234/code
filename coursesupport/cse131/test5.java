package cse131;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int C = ap.nextInt("How many types of candy?");
		int M = ap.nextInt("How many makers?");
		int pieces[]=new int[C];
		int makers[]=new int[C];
		double prices[]=new double[M];
		for(int i=0;i<=C-1;i++){
			pieces[i]=ap.nextInt("How many pieces for type");
		}
		for(int i=0;i<=C-1;i++){
			makers[i]=ap.nextInt("the makers number for each type?");
			
		}
		for(int i=0;i<=M-1;i++){
			prices[i]=ap.nextDouble("What's the prices of each maker($)?");
		}
		double makerprices[]=new double[C];
		for(int i=0;i<=C-1;i++){
			for(int j=0;j<=M-1;j++){
				if(makers[i]==j){makerprices[i]=prices[j];}
			}
			
		}
		double sum=0;
		for(int i=0;i<=C-1;i++){
			sum=sum+(makerprices[i]*pieces[i]);
		}
		sum=(double)Math.round((sum)*100)/100;
		System.out.println("The total price is $"+sum);
	}

}
