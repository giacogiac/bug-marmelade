package transport.giac.fedps;

import java.util.Date;

import javax.jws.*;

import transport.giac.fedps.messages.*;


@WebService(endpointInterface = "dn.fedps.DeliveryService")
public class DeliveryServiceImpl implements DeliveryService {

	@Override
	public OrderResponse order(OrderRequest request) throws DeliveryFault {
		OrderResponse response = new OrderResponse();
		response.orderId = "mock_id";
		return response;
	}

	@SuppressWarnings("deprecation")
	@Override
	public EstimationResponse estimation(EstimationRequest request) throws DeliveryFault {
		EstimationResponse response = new EstimationResponse();
		response.quote = new Quote();
		response.quote.price = 0;
		if(request.dimensions.depth > 50
				|| request.dimensions.height > 50
				|| request.dimensions.width > 50) {
			response.quote.price += 25;
		} else {
			response.quote.price += 5;
		}
		response.quote.edd = new Date(2013, 12, 25);
		return response;
	}

	@SuppressWarnings("deprecation")
	@Override
	public TrackResponse track(TrackRequest request) throws DeliveryFault {
		if(!request.orderId.equals("mock_id"))
			throw new UnknownOrderFault();
		TrackResponse response = new TrackResponse();
		response.location = "Las Vegas";
		response.edd = new Date(2013, 12, 25);
		return response;
	}

}
