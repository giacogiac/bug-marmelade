package external.transport.adrien.fedps;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="VoucherClass")
public class Voucher {
	
	private ArrayList<Package> list_package;
	private double price;
	private String delivery;
	private String id_file;
	
	public Voucher() {
		list_package = new ArrayList<Package>();
		price = 0;
		delivery = "";
		id_file = "";
	}
	
	public Voucher(ArrayList<Package> list) {
		list_package = list;
		calculate_price();
		calculate_delivery();
		id_file = "ORDER_1234";
	}
	
	private void calculate_delivery() {
		delivery = "12/12/12";
	}

	private void calculate_price() {
		price = 0;
		for (int i=0; i<list_package.size(); i++) {
			price = price + (list_package.get(i).getPoids()*list_package.get(i).getDimension().getVolume());
		}
	}

	public ArrayList<Package> getList_package() {
		return list_package;
	}
	public void setList_package(ArrayList<Package> list_package) {
		this.list_package = list_package;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getId_file() {
		return id_file;
	}

	public void setId_file(String id_file) {
		this.id_file = id_file;
	}

}
