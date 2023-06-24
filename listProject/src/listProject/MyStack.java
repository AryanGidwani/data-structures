package listProject;

public class MyStack {
	// attributes num and top
	public int num;
	public StudentInfo top;
	
	public MyStack() {
		// initializing values
		num = 0;
		top = null;
	}
	
	// push method pushes the information of a student to the top of the stack
	public void push(StudentInfo newStudent) {
		if (newStudent == null) {
			return; // does nothing and returns to the caller if there is no new student
		}
		if (top == null)
		{
			top = newStudent; // new student gets added to the top
			num++; // number variable gets increased by 1
			return;
			
		}
		newStudent.next = top; // previous top of the list is no longer at the top 
		top = newStudent; // new student is now at the top of the list
		num++; // increments value of num
	}
	
	// pop method returns and removes the element that is at the top of the stack
	public StudentInfo pop() {
		if (top == null) {
			System.out.println("The stack is empty!"); // tells the user that the list is empty
			return null;
		}
		else {
			StudentInfo studentToRemove = top; 
			top = top.next; // points to the next student
			num--; // reduces the variable that holds the number of elements in the stack by 1
			studentToRemove.next = null;
			return studentToRemove; // returns the removed student to the user
		}
	}
	
	// returns the element at the top of the stack to the caller
	public StudentInfo peek() {
		return top;
		// returns the top of the stack
	}
	
	// displays the entire stack from top to bottom
	public void display() {
		if (top == null) {
			System.out.println("The stack is empty!"); // tells caller that stack is empty
			return;
		}
		StudentInfo currentItem = top;
		for (int i = 0; i < num; i++) {
			// loops through and prints all the information of the students
			System.out.println(currentItem.studentNumber);
			System.out.println(currentItem.firstName); 
			System.out.println(currentItem.lastName);
			currentItem = currentItem.next;
			System.out.println(" ");
			
		}
	}

}
