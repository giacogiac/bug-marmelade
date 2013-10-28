package warehouse.data;

import java.util.Date;
import java.util.List;

public class Delivery {
	private String transporter;
	private Date dateOfPickUp;
	private List<Product> listProduct;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

}
