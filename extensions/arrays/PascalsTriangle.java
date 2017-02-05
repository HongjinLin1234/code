package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("row and column for table?");
		int [][]table=new int [N][N];
		for(int r=0;r<=N-1;r++){
			for(int c=0;c<=r;c++){
				if((c==0)||(c==r)){table[r][c]=1;}
				if((r>=1)&&(c>=1)&&(r!=c)){table[r][c]=table[r-1][c]+table[r-1][c-1];}
			}
		}
		System.out.println("    column");
		System.out.print("    ");
		for(int c=0;c<=N-1;c++){System.out.print(c+"   ");}
		System.out.println();
		System.out.println("row ");
		for(int r=0;r<=N-1;r++){
			if(r<10){System.out.print(r+"   ");}
			if(r>=10){System.out.print(r+"  ");}
			for(int c=0;c<=r;c++){
				if(table[r][c]>=100)
				{System.out.print(table[r][c]+" ");}
				if((table[r][c]>=10)&&(table[r][c]<100))
				{System.out.print(table[r][c]+"  ");}
				if(table[r][c]<10)
				{System.out.print(table[r][c]+"   ");}
			}
			System.out.println();
		}
	}

}
