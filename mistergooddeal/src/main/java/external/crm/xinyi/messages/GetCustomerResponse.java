package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseGetCustomer")
public class GetCustomerResponse {
	@XmlElement(required = true, name = "Customer")
	public Customer customer;
}
