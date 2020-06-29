package interfaces;

public class Student implements Customer {

	@Override
	public void eat() {
		System.out.println("Yummi, student is eating...");
		
	}

	@Override
	public void pay() {
		System.out.println("Student is paying...");
		
	}
	
	

}
