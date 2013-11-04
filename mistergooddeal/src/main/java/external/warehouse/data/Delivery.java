package external.warehouse.data;

import java.util.Date;
import java.util.List;

public class Delivery {
	
	private String transporter;
	private Date dateOfDelivery;
	private List<Product> listProduct;
	
	public Delivery(String transporter, Date dateOfDelivery,
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
	public Date getdateOfDelivery() {
		return dateOfDelivery;
	}
	public void setdateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

}
