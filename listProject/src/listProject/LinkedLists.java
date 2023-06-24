package listProject;

public class LinkedLists {
	// creates attributes frontOfList and numInList
	public StudentInfo frontOfList;
	public int numInList;
	
	public LinkedLists() {
		frontOfList = null;
		numInList = 0;
	}
	
	public void addToFront(StudentInfo itemToAdd) {
		// adding the item to the front of the list only if no one is in the front
		if (numInList == 0) {
			frontOfList = itemToAdd;
			numInList++;
			return;
		}
		// points the item to the front of the list
		else {
			itemToAdd.next = frontOfList;
			frontOfList = itemToAdd;
			numInList++;
			return;
		}
		
		
	}
	
	public void addToRear(StudentInfo itemToAdd, StudentInfo rearStudent) {
		// adding the item to the front of the list only if no one is in the front
		if (numInList == 0) {
			frontOfList = itemToAdd;
			numInList++;
			return;
		}
		// points the item to the front of the list
		
		
	}
		
	public void displayList() {
		if (numInList == 0) {
			System.out.println("The list is unfortunately empty!!");
			return;
		}
		StudentInfo currentItem = frontOfList;
		for (int i = 1; i <= numInList; i++) {
			if (i == 1) {
				System.out.println(" " + currentItem.firstName + " " + currentItem.lastName);
			}
			currentItem = currentItem.next;
			if (currentItem != null) {
				System.out.println(" " + currentItem.firstName + " " + currentItem.lastName + " " + currentItem.studentNumber);
			}
			
			else {
				System.out.println("The list has no names and is empty!");
				return;
			}
			
		}
	}

}
