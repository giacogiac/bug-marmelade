package external.transport.adrien.fedps;

import java.util.ArrayList;

import javax.jws.*;

@WebService(serviceName="Fedps")
public interface FedpsService {

	@WebMethod
	public String order_delivery(@WebParam(name="list_packages") ArrayList<Package> lists_packages);
	
	@WebMethod
	public Voucher devis(@WebParam(name="list_packages") ArrayList<Package> lists_packages);
	
	@WebMethod
	public String estimate_delivery_date(@WebParam(name="id_file") String id_file) throws UnknownIdFile;
	
	@WebMethod
	public double price(@WebParam(name="id_file") String id_file) throws UnknownIdFile;
	
	@WebMethod
	public Tracking track(@WebParam(name="id_file") String id_file) throws UnknownIdFile;
	
}
