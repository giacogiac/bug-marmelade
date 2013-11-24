package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseCreateCustomer")
public class CreateCustomerResponse {
	@XmlElement(required = true, name = "idCustomer")
	public int idCustomer;
}
