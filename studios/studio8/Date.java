package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date implements Working{
	
	private final int month;
	private final int day;
	private final int year;
	private boolean ifisholiday;
	
	
	public Date(int month, int day, int year,boolean ifisholiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.ifisholiday=ifisholiday;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public boolean isIfisholiday() {
		return ifisholiday;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + (ifisholiday ? 1231 : 1237);
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (ifisholiday != other.ifisholiday)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	public String toString(){
    	if(ifisholiday==true){return day+"/"+month+"/"+year+" "+"Holiday";}
    	else{return day+"/"+month+"/"+year+" "+"Not Holiday";}
    }
    public boolean isEarlierThan(Date other){
    	if(this.year>other.getYear()){return false;}
    	else if(this.year<other.getYear()){return true;}
    	else
    	{if(this.month>other.getMonth()){return false;}
    	else if(this.month<other.getMonth()){return true;}
    	else
    	{
    		if(this.day>=other.getDay()){return false;}
    		else{return true;}
    	}
    	}
    }
    @Override
	public boolean amWorking() {
		// TODO Auto-generated method stub
		if(this.day%2==0){return true;}
		else{return false;}
	}
	public static void main(String[] args) {
		Date d=new Date(3,29,2017,false);
		System.out.println(d);
		Date d1=new Date(4,29,2017,false);
		System.out.println(d.equals(d1));
		Date d3=new Date(4,1,2017,true);
		Date d4=new Date(5,1,2017,true);
		Date d5=new Date(3,30,2016,false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d1);
		list.add(d3);
		list.add(d1);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d3);
		set.add(d1);
		System.out.println(set);
		System.out.println(d1.isEarlierThan(d3));

		

	}
	

}
