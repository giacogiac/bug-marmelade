package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class EstimationRequest {

	@XmlElement(required = false, name = "pickup")
	public String pickupPlace;

	@XmlElement(required = false, name = "delivery")
	public String deliveryPlace;

	@XmlElement(required = true, name = "dimensions")
	public Dimensions dimensions;

	@XmlElement(required = true, name = "weigth")
	public int weight;

}
