package crm.ben.model;

import java.util.ArrayList;

public class Commande {
	
	private long id;
	private long idCustomer;
	private ArrayList<Long> idProduit;
	private String deliveryAdress;
	private String deliveryType;
	private String status;
	
	
	public String getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}
	

	public ArrayList<Long> getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(ArrayList<Long> idProduit) {
		this.idProduit = idProduit;
	}
	@Override
	public boolean equals(Object obj) {
		return ((Commande)obj).id==(this.id);
	}
}
