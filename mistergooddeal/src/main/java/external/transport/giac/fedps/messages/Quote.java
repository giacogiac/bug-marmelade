package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

import java.util.Date;

@XmlType(name = "Quote")
public class Quote {

	@XmlElement(required = true, name = "edd")
	public Date edd;

	@XmlElement(required = true, name = "price")
	public int price;

}
