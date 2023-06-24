// dequeue removes from the front, enqueue adds to the back, and display() returns information about the student
package listProject;
public class MyQueue {
	// attributes front and num
	public int num;
	public StudentInfo front;
	
	public MyQueue() {
		// initializing values
		num = 0;
		front = null;
	}
	
	// add to back method
	public void enqueue(StudentInfo newStudent) {
		if (newStudent == null) {
			return; // returns 
		}
		if (num <= 0) {
			num = 1;
			front = newStudent; // stores the new student at the front of the queue
			return; // returns
		}
		StudentInfo currentItem = front; // stores the student at the front of the list in a currentItem variable
		for (int i = 1; i <= num; i++) {
			if (currentItem.next == null) {
				currentItem.next = newStudent; // adds the student 
				num++; // number of people in the list increases by one
				return;
			}
			currentItem = currentItem.next; 
		}
	}
	
	// remove from front method
	public StudentInfo dequeue() {
		if (num <= 0) {
			System.out.println("The list is empty!"); // says the list is empty if the counter variable num is less than or equal to 0
			return null;
		}
		StudentInfo studentToRemove = front;
		front = front.next; // points to the next element in the list
		num --; ; // reduces the num variable, which holds the number of elements in the list by 1
		return studentToRemove; // returns the removed student
	}
	
	public void display() {
		if (num <= 0) {
			System.out.println("The list is empty!!"); // tells the user that the list is empty if it is
			return;
		}
		StudentInfo currentItem = front;
		for (int i = 1; i <= num; i++) {
			System.out.println(currentItem.studentNumber); // prints student number
			System.out.println(currentItem.firstName); // prints first name
			System.out.println(currentItem.lastName); // prints last name
			currentItem = currentItem.next; // moves on to the next person in the list
			System.out.println(" "); // prints a space between the information of the students
		}
	}

}
