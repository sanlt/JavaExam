package Inheritance;

public class Siamese extends Cat {

	protected int x = 2;
	protected int y = 2;

	public int getY() {
		return y;
	}

	public void print() {
		System.out.println("Siamese x:" + x);
		System.out.println("Siamese y: " + y);
		System.out.println("Cat x: " + super.x);
		System.out.println("Animal x: " + ((Animal) this).x);
		System.out.println("Cat y: " + super.getY());
		System.out.println("Animal y:" + ((Animal) this).y);
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		System.out.println(myCat.x); // 1
		System.out.println(((Animal) myCat).x); // 0
		System.out.println(myCat.getY()); // 1
		System.out.println(((Animal) myCat).getY()); // Does NOT work as you might expect! // 1
		System.out.println(((Animal) myCat).x); // 0

		Siamese mySiamese = new Siamese();
		mySiamese.print();
	}

}
