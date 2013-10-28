package warehouse.service;


import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import warehouse.data.*;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="OrderRequest")
public class OrderRequest {
	
	@XmlElement(required=true, name="supplier")
	public String supplier;
	@XmlElement(required=true, name="date")
	public String dateOfDelivery;
	@XmlElement(required=true, name="ref")
	public List<Product> listProduct;
}
