package external.transport.giac.fedps;

import javax.jws.*;

import external.transport.giac.fedps.messages.*;

@WebService(name = "delivery")
public interface DeliveryService {

	@WebMethod
	@WebResult(name = "response")
	public OrderResponse order(@WebParam(name = "message") OrderRequest request)
			throws DeliveryFault;

	@WebMethod
	@WebResult(name = "response")
	public EstimationResponse estimation(@WebParam(name = "message") EstimationRequest request)
			throws DeliveryFault;

	@WebMethod
	@WebResult(name = "response")
	public TrackResponse track(@WebParam(name = "message") TrackRequest request)
			throws DeliveryFault;

}
