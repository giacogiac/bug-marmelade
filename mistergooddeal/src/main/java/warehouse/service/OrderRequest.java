package warehouse.service;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="OrderRequest")
public class OrderRequest {
	
	@XmlElement(required=true, name="supplier")
	public String supplier;
	@XmlElement(required=true, name="date")
	public String dateOfDelivery;
	@XmlElement(required=true, name="ref")
	public int refProdct;
	@XmlElement(required=true, name="quantity")
	public int quantity;
}
