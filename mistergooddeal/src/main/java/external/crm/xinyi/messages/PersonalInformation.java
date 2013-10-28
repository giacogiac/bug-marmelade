package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "PersonalInformation")
public class PersonalInformation {

	@XmlElement(name = "firstName")
	public String firstName;

	@XmlElement(name = "lastName")
	public String lastName;

	@XmlElement(name = "deliveryAddress")
	public String deliveryAddress;
	
}
