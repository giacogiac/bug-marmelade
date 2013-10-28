package external.crm.xinyi;

import javax.jws.*;

import external.crm.xinyi.exceptions.*;
import external.crm.xinyi.messages.*;

@WebService(serviceName = "Crm")
public interface CrmService {

	// Customer Accounts
	@WebMethod
	@WebResult(name = "response")
	public CreateCustomerResponse createCustomer(
			@WebParam(name = "message") CreateCustomerRequest request)
			throws CrmExceptions;

	@WebMethod
	@WebResult(name = "response")
	public DeleteResponse deleteCustomer(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions;

	@WebMethod
	@WebResult(name = "response")
	public GetCustomerResponse getCustomer(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions;

	// Order Processing
	@WebMethod
	@WebResult(name = "response")
	public AddOrderResponse addOrder(
			@WebParam(name = "message") AddOrderRequest request)
			throws CrmExceptions;

	@WebMethod
	@WebResult(name = "response")
	public DeleteResponse deleteOrder(
			@WebParam(name = "message") DeleteOrderRequest request)
			throws CrmExceptions;
	
	@WebMethod
	@WebResult(name = "response")
	public GetCustomerOrderResponse getCustomerOrder(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions;
	
	// Extract preferred products
	@WebMethod
	@WebResult(name = "response")
	public GetCustomerPreferredProductsResponse getCustomerPreferredProducts(
			@WebParam(name = "message") OperateCustomerRequest request)
			throws CrmExceptions;
	
	// Expose Catalog
	@WebMethod
	@WebResult(name = "response")
	public SearchCatalogResponse searchCatalog(
			@WebParam(name = "message") SearchCatalogRequest request)
			throws CrmExceptions;
}
