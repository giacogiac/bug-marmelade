package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "OrderRequest")
public class OrderRequest {

	@XmlElement(required = true, name = "pickup")
	public String pickupPlace;

	@XmlElement(required = true, name = "delivery")
	public String deliveryPlace;

	@XmlElement(required = true, name = "dimensions")
	public Dimensions dimensions;

	@XmlElement(required = true, name = "weigth")
	public int weight;

}
