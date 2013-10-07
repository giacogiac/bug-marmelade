package crm.ha.customer;

import javax.ws.rs.*; 
import javax.ws.rs.core.Response; 
import javax.ws.rs.core.Response.Status; 

@Path("/authentication")
public class Authentication {

	@GET
	@Path("/{customerName}/{customerPwd}")
	@Produces("txt/json")
	public Response getExample(@PathParam("customerName") String login, @PathParam("customerPwd") String pwd) { 
		// Validate login
		if (login.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate pwd
		if (login.equals("invalidpwd"))
			return Response.status(Status.NOT_FOUND).build();
		// DB req to take customer's infos
		String id = "{\"ID\": \"customerId\"}\n";
		// name = login
		String name = "{\"Name\": "+ login +"}\n";
		String address = "{\"Address\": customer's address}\n";
		
		String resp = id + name + address;
		return Response.status(Status.OK).entity(resp).build(); 
	}
		
}