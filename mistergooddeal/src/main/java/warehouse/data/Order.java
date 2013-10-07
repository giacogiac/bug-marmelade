package warehouse.data;

import java.io.Serializable;;

public class Order implements Serializable{
	
	private static final long serialVersionUID = -1380185820507634525L;
	
	private String supplier;
	private String dateOfDelivery;
	private int refProdct;
	private int quantity;
	
	
	
	public Order() {
		super();
	}
	public Order(String supplier, String dateOfDelivery, int refProdct,
			int quantity) {
		super();
		this.supplier = supplier;
		this.dateOfDelivery = dateOfDelivery;
		this.refProdct = refProdct;
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
	public int getRefProdct() {
		return refProdct;
	}
	public void setRefProdct(int refProdct) {
		this.refProdct = refProdct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
