package external.warehouse.data;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	private static final long serialVersionUID = -1380185820507634525L;
	
	private String supplier;
	private String dateOfPickup;
	private List<Product> listProduct;;
	
	
	
	public Order() {
		super();
	}
	public Order(String supplier, String dateOfPickup, List<Product> listProduct) {
		super();
		this.supplier = supplier;
		this.dateOfPickup = dateOfPickup;
		this.listProduct = listProduct;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getDateOfPickup() {
		return dateOfPickup;
	}
	public void setDateOfPickup(String dateOfPickup) {
		this.dateOfPickup = dateOfPickup;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
}
