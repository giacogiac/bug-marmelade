package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="LocationResponse")
public class LocationResponse {
	
	@XmlElement(required=true, name="location")
	public String location;
}
