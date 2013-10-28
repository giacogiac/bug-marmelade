package crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "PersonalInformation")
public class PersonalInformation {

	@XmlElement(name = "firstName")
	public String firstName;

	@XmlElement(name = "lastName")
	public String lastName;

	@XmlElement(name = "deliveryAddress")
	public String deliveryAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	
}
