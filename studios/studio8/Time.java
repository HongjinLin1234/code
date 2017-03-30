package studio8;

public class Time implements Working{
	private final int hour;
	private final int minute;
	private boolean ifis12hours;
	
	public Time(int hour, int minute,boolean ifis12hours) {
		this.hour = hour;
		this.minute = minute;
		this.ifis12hours=ifis12hours;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public boolean isIfis12hours() {
		return ifis12hours;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + (ifis12hours ? 1231 : 1237);
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (ifis12hours != other.ifis12hours)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	public boolean isEarlierThan(Time other){
		if(this.hour>other.getHour()){return false;}
		else if(this.hour<other.getHour()){return true;}
		else
		{if(this.minute>=other.getMinute()){return false;}
		else{return false;}
		}
	}
	public String toString(){
    	if((ifis12hours==true)&&(hour<=12)){return hour+":"+minute+" a.m";}
    	else if((ifis12hours==true)&&(hour>12)){return (hour-12)+":"+minute+" p.m";}
    	else {return hour+":"+minute;}
    }
	@Override
	public boolean amWorking() {
		// TODO Auto-generated method stub
		if((this.hour>=9)&&(this.hour<17)){return true;}
		else{return false;}
	}

	public static void main(String[] args) {
		Time t=new Time(13,28,true);
		System.out.println(t);
		Time t1=new Time(14,29,false);
		System.out.println(t.equals(t1));
		System.out.println(t.isEarlierThan(t1));
	}
	

}
