package internal;

import internal.data.ParamsCommand;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="takingOrder")
public interface takingOrder {
	
	@WebResult(name="result")
	public String takeOrder(@WebParam(name="order")ParamsCommand Command);
	
}
