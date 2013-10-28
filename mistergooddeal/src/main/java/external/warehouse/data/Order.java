package external.warehouse.data;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	private static final long serialVersionUID = -1380185820507634525L;
	
	private String supplier;
	private String dateOfDelivery;
	private List<Product> listProduct;;
	
	
	
	public Order() {
		super();
	}
	public Order(String supplier, String dateOfDelivery, List<Product> listProduct) {
		super();
		this.supplier = supplier;
		this.dateOfDelivery = dateOfDelivery;
		this.listProduct = listProduct;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
}
