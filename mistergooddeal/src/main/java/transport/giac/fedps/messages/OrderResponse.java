package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name="ResponseOrder")
public class OrderResponse {

	public String orderId;

}
