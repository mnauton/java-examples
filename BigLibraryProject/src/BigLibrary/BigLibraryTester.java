package BigLibrary;

public class BigLibraryTester {

	public static void main (String[] args) {
		
		String user1, user2;
		
		BigLibrary book1 = new BigLibrary( );
		
		BigLibrary book2 = new BigLibrary( );

		book2.setUsername("Fernando");
		
		book1.setUsername("Eleonor");
		
		System.out.println(book2.toString());
		
	}
}
