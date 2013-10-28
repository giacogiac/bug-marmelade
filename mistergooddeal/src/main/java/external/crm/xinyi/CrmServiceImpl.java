package external.crm.xinyi;

import javax.jws.*;

import external.crm.xinyi.exceptions.*;
import external.crm.xinyi.messages.*;

@WebService(endpointInterface = "crm.CrmService")
public class CrmServiceImpl implements CrmService {

	// Customer Accounts
	@Override
	@WebMethod
	public CreateCustomerResponse createCustomer(
			@WebParam(name = "message") CreateCustomerRequest request)
			throws CrmExceptions {
		CreateCustomerResponse response = new CreateCustomerResponse();
		response.idCustomer = 0001;
		return response;
	}

	@Override
	@WebMethod
	@WebResult(name = "response")
	public DeleteResponse deleteCustomer(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions {
		if (! request.goal.equals("delete"))
			throw new CrmExceptions();
		DeleteResponse response = new DeleteResponse();
		if (request.username == "guo")
			response.remove = true;
		else
			response.remove = false;
		return response;
	}

	@Override
	@WebMethod
	@WebResult(name = "response")
	public GetCustomerResponse getCustomer(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions {
		if (! request.goal.equals("get"))
			throw new CrmExceptions();
		GetCustomerResponse response = new GetCustomerResponse();
		return response;
	}
	
	// Order Processing
	@Override
	@WebMethod
	@WebResult(name = "response")
	public AddOrderResponse addOrder(
			@WebParam(name = "message") AddOrderRequest request)
			throws CrmExceptions {
		AddOrderResponse response = new AddOrderResponse();
		response.identifier=request.username+"-"+request.order.identifier;
		return response;
	}

	@Override
	@WebMethod
	@WebResult(name = "response")
	public DeleteResponse deleteOrder(
			@WebParam(name = "message") DeleteOrderRequest request)
			throws CrmExceptions {
		DeleteResponse response = new DeleteResponse();
		if (request.username == "guo"&&request.identifier==0001)
			response.remove = true;
		else
			response.remove = false;
		return response;
	}

	@Override
	@WebMethod
	@WebResult(name = "response")
	public GetCustomerOrderResponse getCustomerOrder(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions {	
		if (! request.goal.equals("getOrder"))
			throw new CrmExceptions();
		GetCustomerOrderResponse response = new GetCustomerOrderResponse();
		return response;
	}
	
	// Extract preferred products
	@Override
	@WebMethod
	@WebResult(name = "response")
	public GetCustomerPreferredProductsResponse getCustomerPreferredProducts(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions {
		if (! request.goal.equals("getCustomerPreferredProducts"))
			throw new CrmExceptions();
		GetCustomerPreferredProductsResponse response = new GetCustomerPreferredProductsResponse();
		return response;
	}

	@Override
	@WebMethod
	@WebResult(name = "response")
	public SearchCatalogResponse searchCatalog(
			@WebParam(name = "message") SearchCatalogRequest request)
			throws CrmExceptions {
		SearchCatalogResponse response = new SearchCatalogResponse();		
		return response;
	}
}
