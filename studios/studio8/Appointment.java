package studio8;

public class Appointment {
    public final Time time;
    public final Date date;
    
    
	public Appointment(Time time, Date date) {
		this.time = time;
		this.date = date;
	}
	


	public Time getTime() {
		return time;
	}



	public Date getDate() {
		return date;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "[time=" + time + ", date=" + date + "]";
	}
     public boolean Working(){
    	 if(this.date.amWorking()==false){return false;}
    	 else if(this.time.amWorking()==false){return false;}
    	 else{return true;}
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(13,28,true);
		Date d=new Date(3,28,2017,false);
       Appointment a=new Appointment(t,d);
       System.out.println(a);
       System.out.println(a.Working());
       
	}

}
