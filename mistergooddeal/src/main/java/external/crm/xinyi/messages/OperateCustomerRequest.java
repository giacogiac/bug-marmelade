package external.crm.xinyi.messages;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DeleteCustomerRequest")
public class OperateCustomerRequest {
	@XmlElement(required = true, name = "goal")
	public String goal;
	
	@XmlElement(required = true, name = "username")
	public String username;
}
