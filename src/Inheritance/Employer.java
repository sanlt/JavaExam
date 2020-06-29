package Inheritance;

public class Employer extends Person {
	
	private int numberOfEmployees;
	
	public Employer(String name, int numberOfEmployees) {
		super(name);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

}



