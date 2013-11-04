package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DeliveryResp")
public class DeliveryResponse {
	
	@XmlElement(required=true, name="result")
	public boolean result;

}