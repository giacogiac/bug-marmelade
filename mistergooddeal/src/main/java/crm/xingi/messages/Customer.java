package crm.xingi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "Customer")
public class Customer {
	@XmlElement(required = true, name = "username")
	public String username;
	
	@XmlElement(required = true, name = "password")
	public String password;

	@XmlElement(required = true, name = "PersonalInformation")
	public PersonalInformation PersonalInformation;

	@XmlElement(name = "orders")
	public List<Order> orders;
}
