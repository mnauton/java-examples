package animals;

public class AnimalsTester {
	public static void main(String[] args) {
		Dog myDog; // I declare a variable of type Dog that now points to nothing, but later will point to a Dog object
		myDog = new Dog("Bobby", 10); // I create a Dog object and make the variable myDog point to it.
		Dog yourDog;
		yourDog = new Dog("Tacos", 5);
		
		String myDogsWof = myDog.bark();
		
		System.out.println(myDogsWof);
		
		myDog.name = "pepito";
		
		System.out.println(myDog.getAge());
		
		System.out.println(myDog.bark());
		
		Person myFriend = new Person("pepito", myDog);
		System.out.println(myFriend.getDogAge());

	}	
}
