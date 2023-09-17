package Bicycle;

public class BicycleRegistration {

	public static void main (String [] args) {
		
		String owner1, owner2;
		
		Bicycle bike1 = new Bicycle();
		bike1.setOwnerName("Margaux");
		
		Bicycle bike2 = new Bicycle();
		bike2.setOwnerName("Fernando");
		
		owner1 = bike1.getOwnerName( );
		owner2 = bike2.getOwnerName( );
		
		System.out.println(bike1.getOwnerName());
		System.out.println(owner2 + " also owns a bicycle.");
		
		System.out.println(bike2.toString());
	}
}
