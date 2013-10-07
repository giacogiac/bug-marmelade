package warehouse.data;

import java.io.Serializable;

public class Product implements Serializable{


	
	private static final long serialVersionUID = -3703709642368543689L;

	
	private int id;
	private int warningLimit;
	private int quantity;
	private String name;
	
	public Product(int id, int warningLimit, int quantity, String name) {
		super();
		this.id = id;
		this.warningLimit = warningLimit;
		this.quantity = quantity;
		this.name = name;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWarningLimit() {
		return warningLimit;
	}
	public void setWarningLimit(int warningLimit) {
		this.warningLimit = warningLimit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
