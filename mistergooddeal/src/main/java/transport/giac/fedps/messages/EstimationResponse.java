package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlType(name="ResponseEstimation")
public class EstimationResponse {

	public Quote quote;

}
