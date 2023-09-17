package Week2;

public class LocationTester {

	public static void main(String[] args) {		
		SimpleLocation uscd = new SimpleLocation(32.9, -117.2);
		SimpleLocation lima = new SimpleLocation(-12.0, -77.0);		
		System.out.println(uscd.distance(lima));
	}
}
