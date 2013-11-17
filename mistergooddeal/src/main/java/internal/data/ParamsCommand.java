package internal.data;

import java.util.List;


public class ParamsCommand {
	
	private String deliveryAddress;
	private String idCommand;
	private List<Long> listProd;
	private String idCustomer;
	
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getIdCommand() {
		return idCommand;
	}
	public void setIdCommand(String idCommand) {
		this.idCommand = idCommand;
	}
	public List<Long> getListProd() {
		return listProd;
	}
	public void setListProd(List<Long> listProd) {
		this.listProd = listProd;
	}
	
	
}
