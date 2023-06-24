package listProject;

public class Main {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(717222, "Aryan", "Gidwani"); 
		StudentInfo s2 = new StudentInfo(810951, "Daffy", "Duck");
		StudentInfo s3 = new StudentInfo(234233, "Charms", "Lucky");
		
		MyQueue queue = new MyQueue();
		MyStack stack = new MyStack();
		
		queue.enqueue(s1);
		queue.enqueue(s2);
		queue.enqueue(s3);
		queue.dequeue();
		queue.display();
	}

}
