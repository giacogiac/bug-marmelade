package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseOrder")
public class OrderResponse {

	@XmlElement(required = true, name = "order")
	public String orderId;

}
