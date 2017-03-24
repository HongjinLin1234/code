package lab7;

public class Course {
   private String name;
   private int credits;
   private int seats;
   private String roster;
   private int studentin;
   private double gpasum;
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

public int getStudentin() {
	return studentin;
}
public String getRoster() {
	return roster;
}
public boolean addStudent(Student a){
	if(seats>0){
		this.roster=this.getRoster()+" "+a.getName();
		seats=seats-1;
		studentin=studentin+1;
		gpasum=gpasum+a.getGPA();
		return true;
	}
	else{
		return false;
	}
}
public double averageGPA(){
	double average=gpasum/studentin;
	return average;
}

public String toString() {
		return name+credits+seats;}
   
}
