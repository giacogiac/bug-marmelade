package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "DeleteOrderRequest")
public class DeleteOrderRequest {
	@XmlElement(required = true, name = "username")
	public String username;
	
	@XmlElement(required = true, name = "identifier")
	public int identifier;
}
