package transport.adrien.FedPS;

public class Tracking {
	
	private String current_location;
	private String estimate_delivery_date;
	
	public Tracking() {
		current_location = "";
		estimate_delivery_date = "";
	}
	
	public String getCurrent_location() {
		return current_location;
	}
	public void setCurrent_location(String current_location) {
		this.current_location = current_location;
	}
	public String getEstimate_delivery_date() {
		return estimate_delivery_date;
	}
	public void setEstimate_delivery_date(String estimate_delivery_date) {
		this.estimate_delivery_date = estimate_delivery_date;
	}
	
}
