package internal;

import internal.data.ParamsCommand;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="ModifyOrder")
public interface handleModifyOrder {

	@WebResult(name="result")
	public String modifyOrder(@WebParam(name="newCommand")ParamsCommand newCommand);
	
}
