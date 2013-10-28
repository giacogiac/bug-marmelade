package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="QuantityResponse")
public class QuantityResponse {

	@XmlElement(required=true, name="quantity")
	public int quantity;
}
