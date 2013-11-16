package internal;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="CheckStatus")
public interface handleCheckStatus {

	@WebResult(name="result")
	public String checkstatus(@WebParam(name="idCommand") String idCommand);
	
}
