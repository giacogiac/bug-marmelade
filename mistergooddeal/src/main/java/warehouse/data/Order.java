package warehouse.data;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	private static final long serialVersionUID = -1380185820507634525L;
	
	private String supplier;
	private String dateOfDelivery;
	private List<Product> listProduct;
	private int quantity;
	
	
	
	public Order() {
		super();
	}
	public Order(String supplier, String dateOfDelivery, List<Product> listProduct,
			int quantity) {
		super();
		this.supplier = supplier;
		this.dateOfDelivery = dateOfDelivery;
		this.listProduct = listProduct;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
