package external.warehouse.data;

import java.util.Date;
import java.util.List;

public class Delivery {
	
	private String transporter;
	private String dateOfDelivery;
	private List<Product> listProduct;
	
	public Delivery(String transporter, String dateOfDelivery,
			List<Product> listProduct) {
		super();
		this.transporter = transporter;
		this.dateOfDelivery = dateOfDelivery;
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
	public String getdateOfDelivery() {
		return dateOfDelivery;
	}
	public void setdateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

}
