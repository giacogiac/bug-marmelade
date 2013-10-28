package crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "Product")
public class Product {
	@XmlElement(name = "name")
	public String name;
	
	@XmlElement(name = "category")
	public String category;
	
	@XmlElement(name = "reference")
	public String reference;
	
	@XmlElement(name = "price")
	public int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
