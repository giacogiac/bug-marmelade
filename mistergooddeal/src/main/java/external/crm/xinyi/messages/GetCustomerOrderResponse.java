package external.crm.xinyi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseGetCustomerOrder")
public class GetCustomerOrderResponse {
	@XmlElement(name = "orders")
	public List<Order> orders;
}
