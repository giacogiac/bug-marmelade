package crm.ben.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import crm.ben.model.Customer;
import crm.ben.model.Server;


@Path("customer")
public class CustomerService {

	@GET
	@Path("/{customerId}")
	@Produces("text/json")
	public Response getCustomer(@PathParam("customerId") String customerId) {
		Customer c = new Customer();
		try {
			c.setId(Long.valueOf(customerId));
			if (Server.getInstance().customers.indexOf(c) != -1) {
				c = Server.getInstance().customers
						.get(Server.getInstance().customers.indexOf(c));
				return Response
						.status(Status.OK)
						.entity("{\"id\": \"" + String.valueOf(c.getId())
								+ "\", \"name\": \"" + c.getName() + "\", "
								+ "\"familyname\": \"" + c.getFamilyName()
								+ "\", " + "\"deliveryAddress\": \""
								+ c.getDeliveryAdress() + "\"}").build();
			}
		} catch (NumberFormatException e) {

		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@POST
	@Produces("text/json")
	public Response creatCustomer(@QueryParam("name") String name,
			@QueryParam("password") String password,
			@QueryParam("mail") String mail,
			@QueryParam("familyName") String familyName,
			@QueryParam("deliveryAdress") String deliveryAdress,
			@QueryParam("billingAdress") String billingAdress,
			@QueryParam("phone") String phone) {
		Customer c = new Customer();
		c.setName(name);
		c.setFamilyName(familyName);
		c.setMail(mail);
		c.setDeliveryAdress(deliveryAdress);
		c.setPassword(password);
		c.setBillingAdress(billingAdress);
		c.setPhone(phone);

		return Response
				.status(Status.OK)
				.entity("{\"id\": \""
						+ String.valueOf(Server.getInstance().addCustomer(c)
								+ "\"}")).build();

	}

	@DELETE
	@Path("/{customerId}")
	@Produces("text/json")
	public Response deleteCustomer(@PathParam("customerId") String customerId) {
		Customer c = new Customer();
		c.setId(Long.valueOf(customerId));
		if (Server.getInstance().customers.indexOf(c) != -1) {
			c = Server.getInstance().customers
					.remove(Server.getInstance().customers.indexOf(c));
			return Response.status(Status.NO_CONTENT).build();
		} else
			return Response.status(Status.NOT_FOUND).build();
	}

}
