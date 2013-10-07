package warehouse.data;

import java.util.Date;

public class Delivery {
	private String transporter;
	private Date dateOfPickUp;
	private int refProduct;
	private int quantity;
	
	public String getTransporter() {
		return transporter;
	}
	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}
	public Date getDateOfPickUp() {
		return dateOfPickUp;
	}
	public void setDateOfPickUp(Date dateOfPickUp) {
		this.dateOfPickUp = dateOfPickUp;
	}
	public int getRefProduct() {
		return refProduct;
	}
	public void setRefProduct(int refProduct) {
		this.refProduct = refProduct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
