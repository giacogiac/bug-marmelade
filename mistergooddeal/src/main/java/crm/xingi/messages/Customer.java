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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonalInformation getPersonalInformation() {
		return PersonalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		PersonalInformation = personalInformation;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
