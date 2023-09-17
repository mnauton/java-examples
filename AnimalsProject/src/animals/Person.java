package animals;

public class Person {
	
	private String name;
	private Dog dog;
	
	public Person(String name, Dog hisDog) {
		this.name = name;
		this.dog = hisDog;
	}
	
	public int getDogAge() {
		return this.dog.getAge();
	}
	
	public String getDogName() {
		return this.dog.name;
	}
}
