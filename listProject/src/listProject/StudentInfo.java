package listProject;

public class StudentInfo {
	// creates attributes 
	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo next;
	
	public StudentInfo(int studentNumber, String firstName, String lastName) {
		// initializes attributes to parameters in the constructor
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		next = null; // always set to null
	}

}
