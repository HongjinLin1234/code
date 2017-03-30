package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {
    private final Set<Appointment> c;
    
    
	public Calendar() {
		this.c = new HashSet<Appointment>();
	}
	public void addAppointment(Appointment a){
		c.add(a);
	}
    

	@Override
	public String toString() {
		return "Calendar [" + c + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(13,28,true);
		Date d=new Date(3,29,2017,false);
		Time t1=new Time(14,29,false);
		Date d1=new Date(4,29,2017,false);
       Appointment a=new Appointment(t,d);
       Appointment a1=new Appointment(t1,d1);
       Calendar c=new Calendar();
       c.addAppointment(a);
       c.addAppointment(a1);
       System.out.println(c);
       

	}

}
