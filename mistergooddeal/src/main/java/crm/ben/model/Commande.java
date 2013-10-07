package crm.ben.model;

public class Commande {
	
	private long id;
	private long idCustomer;
	private long idProduit;
	
	
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
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Commande)obj).id==(this.id);
	}
}
