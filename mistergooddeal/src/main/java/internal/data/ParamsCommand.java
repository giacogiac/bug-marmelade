package internal.data;

import java.util.List;


public class ParamsCommand {
	
	private String deliveryAddress;
	private String idCommand;
	private List<Product> listProd;
	private String idCustomer;
	private String expectation;
	private String statu;
	
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
	public List<Product> getListProd() {
		return listProd;
	}
	public void setListProd(List<Product> listProd) {
		this.listProd = listProd;;
	}
	public String getExpectation() {
		return expectation;
	}
	public void setExpectation(String expectation) {
		this.expectation = expectation;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	
	
}
