package external.crm.xinyi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseSearchCatalog")
public class SearchCatalogResponse {
	@XmlElement(required = true, name = "productsFound")
	public List<Product> productsFound;
}
