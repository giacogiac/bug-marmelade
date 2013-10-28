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
	
}
