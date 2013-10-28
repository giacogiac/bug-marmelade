package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class OrderRequest {

	@XmlElement(required = true, name = "pickup")
	public String pickupPlace;

	@XmlElement(required = true, name = "delivery")
	public String deliveryPlace;

	@XmlElement(required = true)
	public Dimensions dimensions;

	@XmlElement(required = true)
	public int weight;

}
