package cse131;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;
        String spring []=new String [200];
        for(i=1;i<=200;i++){
        	if((i<=90)&&(i%3==0)){
        		spring[i]="pop";
        		System.out.println(spring[i]);
        	}
        	if((i>90)&&(i%3!=0)){
        		System.out.println("corn");
        	}
        	if((i>90)&&(i%3==0)){
        		System.out.println("Popcorn");
        	}
        	if((i<=90)&&(i%3!=0)){
        		System.out.println(i);
        	}
        		
        }
	}

}
