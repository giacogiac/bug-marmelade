package external.warehouse.service;


import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import external.warehouse.data.*;


@XmlType(name="OrderRequest")
public class OrderRequest {
	
	@XmlElement(required=true, name="client")
	public String supplier;
	@XmlElement(required=true, name="date")
	public String dateOfDelivery;
	@XmlElement(required=true, name="product")
	public List<Product> listProduct;
}
