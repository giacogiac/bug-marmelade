package external.crm.xinyi.messages;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseGetCustomerPreferredProducts")
public class GetCustomerPreferredProductsResponse {
	@XmlElement(required = true, name = "PreferredProducts")
	public List<String> PreferredProducts;
}
