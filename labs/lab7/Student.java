package lab7;

public class Student {
    private String firstname;
    private String lastname;
    private int StudentID;
    private int credits;
    private double GPA;
    
	
	public Student(String firstname, String lastname, int StudentID) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.StudentID = StudentID;
		this.credits=0;
		this.GPA=0.0;
	}

	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
    public String getName(){
    	return firstname+" "+lastname;
    }
	public int getStudentID() {
		return StudentID;
	}
	public int getCredits() {
		return credits;
	}
	public double getGPA() {
		return GPA;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getClassStanding() {
		if(credits<30){return "Freshman";}
		else if((credits>=30)&&(credits<60)){return "Sophomore";}
		else if((credits>=60)&&(credits<90)){return "Junior";}
		else{return "Senior";}
	}
	public Student createLegacy(Student ss){
		Student b=new Student(this.getName(),ss.getName(),(StudentID+ss.getStudentID()));
		b.setCredits(Math.max(ss.getCredits(), credits));
		b.setGPA((ss.getGPA()+GPA)/2);;
		return b;
	}
	public void submitGrade(double g,int c) {
		double gpatotal=GPA*credits+g*c;
		credits=credits+c;
		GPA=gpatotal/credits;
		GPA=(double)(Math.round(GPA*1000))/1000;
		
	}
	public String toString() {
 		return firstname+"."+lastname+StudentID;}
    
}
