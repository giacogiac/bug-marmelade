package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "AddOrderRequest")
public class AddOrderRequest {
	@XmlElement(required = true, name = "username")
	public String username;
	
	@XmlElement(required = true, name = "order")
	public Order order;
}
