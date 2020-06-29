package interfaces;

public class Restaurant {
	
	public void receive(Customer c) {
		c.eat();
		c.pay();
		System.out.println("Welcome to the Restaurant"); 
	}

}
