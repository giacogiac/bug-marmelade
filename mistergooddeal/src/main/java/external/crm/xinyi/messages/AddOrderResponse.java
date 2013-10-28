package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseAddOrder")
public class AddOrderResponse {
	@XmlElement(required = true, name = "identifier")
	public String identifier;
}


