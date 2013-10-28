package external.crm.xinyi.messages;

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
	
}
