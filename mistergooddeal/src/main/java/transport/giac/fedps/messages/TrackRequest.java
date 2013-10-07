package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "TrackRequest")
public class TrackRequest {

	@XmlElement(required = true, name = "order")
	public String orderId;

}
