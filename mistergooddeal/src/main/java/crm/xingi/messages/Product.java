package crm.xingi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name="Product")
public class Product {
	@XmlElement(required=true, name="productName")
	public String productName;

	@XmlElement(required=true, name="productCategory")
	public String productCategory;
	
	@XmlElement(required=true, name="reference")
	public String reference;
}
