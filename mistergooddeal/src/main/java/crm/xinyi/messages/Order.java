package crm.xinyi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "Order")
public class Order {
	@XmlElement(required = true, name = "identifier")
	public int identifier;
	
	@XmlElement(required = true, name = "statu")
	public String statu;
	
	@XmlElement(required = true, name = "products")
	public List<Product> products;

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
