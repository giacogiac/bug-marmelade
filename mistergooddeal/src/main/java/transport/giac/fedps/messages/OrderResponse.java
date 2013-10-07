package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "OrderResponse")
public class OrderResponse {

	@XmlElement(required = true, name = "order")
	public String orderId;

}
