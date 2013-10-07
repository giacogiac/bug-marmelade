package crm.xingi;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import crm.xingi.exceptions.CrmFault;
import crm.xingi.messages.*;

@WebService(serviceName = "CrmService")
public interface CrmService {
	@WebMethod
	public String login(@WebParam(name = "login") String username,
			@WebParam(name = "pwd") String password) throws CrmFault;

	@WebMethod
	@WebResult(name = "response")
	public ArrayList<Product> orderProduct(
			@WebParam(name = "token", header = true) String token,
			@WebParam(name = "order") Product productOrdered) throws CrmFault;

	public int exposeCatalogueOfCompany(
			@WebParam(name = "catalogue") ArrayList<Product> catalogueOfCompany)
			throws CrmFault;
}
