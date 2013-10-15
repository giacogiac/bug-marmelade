package crm.xingi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "GetCustomerOrderResponse")
public class GetCustomerOrderResponse {
	@XmlElement(name = "orders")
	public List<Order> orders;
}
