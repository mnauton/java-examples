package BigLibrary;

	public class BigLibrary {

		// Data member (variables) using encapsulation (private)
		private String username;
		
		// constructor
		public BigLibrary ( ) {
			this.username = "unassigned";
		}
		
		// getter
		public String getUsername() {
			return this.username;
		}
		
		// setter
		public void setUsername (String name) {
		this.username = name;
		}		
		
		// toString() method
		public String toString( ) {
			return "This book has been borrowed by " + this.username + ".";
		}
	}
