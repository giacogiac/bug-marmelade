package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "DeleteCustomerResponse")
public class DeleteResponse {
	@XmlElement(required = true, name = "remove")
	public boolean remove;
}
