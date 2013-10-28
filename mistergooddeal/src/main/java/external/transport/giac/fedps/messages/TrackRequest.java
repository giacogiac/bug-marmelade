package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class TrackRequest {

	@XmlElement(required = true, name = "order")
	public String orderId;

}
