package external.crm.xinyi.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "SearchCatalogRequest")
public class SearchCatalogRequest {
	@XmlElement(name = "name")
	public String name;
	
	@XmlElement(name = "category")
	public String category;
	
	@XmlElement(name = "reference")
	public String reference;
}
