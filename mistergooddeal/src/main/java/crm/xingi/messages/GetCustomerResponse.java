package crm.xingi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "GetCustomerResponse")
public class GetCustomerResponse {
	@XmlElement(required = true, name = "Customer")
	public Customer customer;
}
