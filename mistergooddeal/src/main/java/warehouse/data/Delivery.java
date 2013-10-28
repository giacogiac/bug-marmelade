package warehouse.data;

import java.util.Date;
import java.util.List;

public class Delivery {
	
	private String transporter;
	private Date dateOfPickUp;
	private List<Product> listProduct;
	
	public Delivery(String transporter, Date dateOfPickUp,
			List<Product> listProduct) {
		super();
		this.transporter = transporter;
		this.dateOfPickUp = dateOfPickUp;
		this.listProduct = listProduct;
	}
	public Delivery() {
		super();
	}
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
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

}
