package external.crm.ha.customer;

import javax.ws.rs.*; 
import javax.ws.rs.core.Response; 
import javax.ws.rs.core.Response.Status; 

@Path("/order")
public class Order {
	@GET
	@Path("/create/{customerID}/{productID}/{date}/{livraison_type}")
	@Produces("txt/json")
	public Response create(@PathParam("customerID") String customerID, @PathParam("productID") String productID,
			@PathParam("date") String date, @PathParam("livraison_type") String livraison_type) { 
		// Validate login
		if (customerID.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate productID
		if (productID.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate date
		if (date.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// Validate livraison_type
		if (livraison_type.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
				
		// DB req 
		String id = "{\"ID\": \" orderID\"}\n";
		String customer = "{\"customerID\": \" "+ customerID + "\"}\n";
		String product = "{\"productID\": "+ productID +"}\n";
		String orderdate = "{\"order_date\": " + date + "}\n";
		String livraisonType = "{\"livraison_type\": " + livraison_type + "}\n";
		
		String resp = id + customer + product + orderdate + livraisonType;
		return Response.status(Status.OK).entity(resp).build(); 
	}
		
	@GET
	@Path("delete/{orderID}")
	@Produces("txt/json")
	public Response delete(@PathParam("orderID") String id) { 
		// Validate id
		if (id.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		
		String resp = "deleted order " + id;
		return Response.status(Status.OK).entity(resp).build(); 
	}
	
	@GET
	@Path("get/{orderID}")
	@Produces("txt/json")
	public Response get(@PathParam("orderID") String id) { 
		// Validate id
		if (id.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		
		// DB req
		String orderid = "{\"orderID\": "+id+"}\n";
		String customerID = "{\"CustomerID\": customerID}\n";
		String product = "{\"productID\": productID}\n";
		String date = "{\"orderdate\": order date}\n";
				
		String resp = "Order info:" + orderid + customerID + product + date;
		return Response.status(Status.OK).entity(resp).build(); 
	}
}
