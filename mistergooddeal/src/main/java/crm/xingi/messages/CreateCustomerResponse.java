package crm.xingi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "CreateCustomerResponse")
public class CreateCustomerResponse {
	@XmlElement(required = true, name = "idCustomer")
	public int idCustomer;
}
