package crm.ha.customer;

import javax.ws.rs.*; 
import javax.ws.rs.core.Response; 
import javax.ws.rs.core.Response.Status; 

@Path("/customer")
public class Customer {
		
	@GET
	@Path("/create/{customerName}/{deliveryAddress}/{email}/{tel}")
	@Produces("txt/json")
	public Response create(@PathParam("customerName") String login, @PathParam("deliveryAddress") String deliverAddress,
			@PathParam("email") String email, @PathParam("tel") String tel) { 
		// Validate login
		if (login.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate email
		if (email.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate tel
		if (tel.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// DB req to take customer's infos
		String id = "{\"ID\": \"customerId\"}\n";
		// name = login
		String name = "{\"Name\": "+ login +"}\n";
		String address = "{\"Address\": " + deliverAddress + "}\n";
		String adresse_email = "{\"Email\": " + email + "}\n";
		String telephone = "{\"Telephone\": " + tel + "}\n";
		
		String resp = id + name + adresse_email + address + telephone;
		return Response.status(Status.OK).entity(resp).build(); 
	}
		
	@GET
	@Path("delete/{customerID}")
	@Produces("txt/json")
	public Response delete(@PathParam("customerID") String id) { 
		// Validate id
		if (id.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		
		String resp = "deleted customer " + id;
		return Response.status(Status.OK).entity(resp).build(); 
	}
	
	@GET
	@Path("get/{customerID}")
	@Produces("txt/json")
	public Response get(@PathParam("customerID") String id) { 
		// Validate id
		if (id.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		
		// DB req
		String name = "{\"Name\": customerName}\n";
		String address = "{\"Address\": Addresse}\n";
		String address_email = "{\"Email\": email}\n";
		String telephone = "{\"Telephone\": tel}\n";
		
		String resp = "Customer info:" + name + address + address_email + telephone;
		return Response.status(Status.OK).entity(resp).build(); 
	}
}