package Week2;

public class SimpleLocation {
	
	public double latitude;
	public double longitude;
	
	public SimpleLocation(double lat, double lon) {
		
		this.latitude = lat;
		this.longitude = lon; 
	}
	
	public double distance(SimpleLocation other) {
		return getDist(this.latitude, this.longitude, other.latitude, other.longitude);			
	}
	
	private double getDist(double x1, double x2, double y1, double y2) {
		return (x1-y2)-(y1-y2);
	}
}
