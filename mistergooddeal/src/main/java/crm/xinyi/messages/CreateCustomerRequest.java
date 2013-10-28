package crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "CreateCustomerRequest")
public class CreateCustomerRequest {
	
	@XmlElement(required = true, name = "Customer")
	public Customer customer;
	
}
