package Stringtheory;

import cse131.ArgsProcessor;

public class Stringtheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArgsProcessor ap=new ArgsProcessor(args);
        String t=ap.nextString("What's your string?");
        int k=0;
        int positive1=0;
        int positive2=0;
        char a[]=new char[t.length()];
        for(int i=0;i<t.length();i++){
        	a[i]=t.charAt(i);
        	if((Character.isDigit(a[i])==false)&&(Character.isWhitespace(a[i])==false)){
        		k=i;
        	}
        }
        String s1="";
        String s2="";
        String s3=Character.toString(a[k]);
        for(int i=0;i<k;i++){
        	if(Character.isWhitespace(a[i])==false)
        	{s1=s1+a[i];}
        }
        for(int i=k+1;i<t.length();i++){
        	if(Character.isWhitespace(a[i])==false){
        	s2=s2+a[i];}
        }
        positive1=Integer.parseInt(s1);
        positive2=Integer.parseInt(s2);
        int result=0;
        if(a[k]=='+'){result=positive1+positive2;}
        if(a[k]=='-'){result=positive1-positive2;}
        if(a[k]=='*'){result=positive1*positive2;}
        if(a[k]=='/'){result=positive1/positive2;}
        System.out.println(positive1+s3+positive2+"="+result);
        
        
	}

}
