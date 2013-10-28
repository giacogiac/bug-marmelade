package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="OrderResp")
public class OrderResponse {
	
	@XmlElement(required=true, name="result")
	public boolean result;

}
