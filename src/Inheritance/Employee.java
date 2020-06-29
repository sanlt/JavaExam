package Inheritance;

public class Employee extends Person {

	private int yearsOfExperience;

	public Employee(String name, int yearsOfExperience) {
		super(name);
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getYearsOfExperience() {
		return this.yearsOfExperience;
	}

}

