package animals;

public class Dog {
	String name; // this is an attribute
	private int age;  // this is an attribute
	private Person owner;
	
	// this is a constructor. It creates an object of this class and assigns the value of the object' attributes
	public Dog(String myName, int myAge) {
		this.name = myName;
		this.age = myAge;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String bark() {
		return "Woff " + this.otherBark();
	}
	
	private String otherBark() {
		return "Private Woff";
	}
}
