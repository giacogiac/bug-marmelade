package crm.xingi.messages;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlType(name="Catalogue")
public class Catalogue {
	@XmlElement(required=true, name="catalogueOfCompany")
	public ArrayList<Product> catalogueOfCompany;
}
