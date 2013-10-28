package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="LocationResp")
public class LocationResponse {
	
	@XmlElement(required=true, name="location")
	public String location;
}
