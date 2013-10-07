package crm.ha.product;

import javax.ws.rs.*; 
import javax.ws.rs.core.Response; 
import javax.ws.rs.core.Response.Status; 

@Path("/catalogue")
public class Catalogue {

	@GET
	//@Path("/{customerName}/{customerPwd}")
	@Produces("txt/json")
	public Response getExample() { 
		// Validate ???
		// DB req to take all products's infos
		String resp = "The product catalogue.";
		return Response.status(Status.OK).entity(resp).build(); 
	}

}
