package Bicycle;

	public class Bicycle {

		private String ownerName;

		// Constructor
		public Bicycle ( ) {
			ownerName = "unassigned";
		}
		// Getter
		public String getOwnerName( ) {
			return ownerName;
		}
		public void setOwnerName(String name) {
			ownerName = name;
		}
	
		// toString() method: Allows to control the output. 
		public String toString() {
			return "This bike belongs to " + ownerName; // + operator is referred to as an "overloaded operator".
		}
	}