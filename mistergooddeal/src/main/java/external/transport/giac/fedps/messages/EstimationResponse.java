package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name = "ResponseEstimation")
public class EstimationResponse {

	@XmlElement(required = true, name = "quote")
	public Quote quote;

}
