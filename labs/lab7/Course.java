package lab7;

public class Course {
   private String name;
   private int credits;
   private int seats;
   private String roster[];
public Course(String name, int credits, int seats) {
	this.name = name;
	this.credits = credits;
	this.seats = seats;
}
public String getName() {
	return name;
}
public int getCredits() {
	return credits;
}
public int getRemainingSeats() {
	return seats;
}


public String[] getRoster() {
	return roster;
}
public boolean addStudent(Student a){
	for(int i=0;i<roster.length;i++){
		if(a.getName()==roster[i]){return false;}
	}
	seats=seats-1;
	return true;
}
   
}
