package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="QuantityRequest")
public class QuantityRequest {

	@XmlElement(required=true, name="product")
	public int idProduct;
}
