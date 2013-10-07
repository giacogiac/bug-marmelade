package crm.ben.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import crm.ben.model.Commande;
import crm.ben.model.Server;


@Path("commande")
public class CommandeService {

	@GET
	@Path("/{commandeId}")
	@Produces("text/json")
	public Response getCustomer(@PathParam("commandeId") String commandeId) {
		Commande c = new Commande();
		try {
			c.setId(Long.valueOf(commandeId));
			if (Server.getInstance().commandes.indexOf(c) != -1) {
				c = Server.getInstance().commandes
						.get(Server.getInstance().commandes.indexOf(c));
				return Response
						.status(Status.OK)
						.entity("{\"id\": \"" + String.valueOf(c.getId())
								+ "\", \"idCustomer\": \"" + c.getIdCustomer()
								+ "\", " + "\"idProduit\": \""
								+ c.getIdProduit() + "\"}").build();
			}
		} catch (NumberFormatException e) {

		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@POST
	@Path("/")
	@Produces("text/json")
	public Response creatCommande(@QueryParam("idCustomer") String idCustomer,
			@QueryParam("idProduit") String idProduit) {
		Commande c = new Commande();
		c.setIdCustomer(Long.valueOf(idCustomer));
		c.setIdProduit(Long.valueOf(idProduit));

		return Response
				.status(Status.OK)
				.entity("{\"id\": \""
						+ String.valueOf(Server.getInstance().addCommande(c)
								+ "\"}")).build();

	}

	@DELETE
	@Path("/{commandeId}")
	@Produces("text/json")
	public Response deleteCustomer(@PathParam("commandeId") String commandeId) {
		Commande c = new Commande();
		c.setId(Long.valueOf(commandeId));
		if (Server.getInstance().commandes.indexOf(c) != -1) {
			c = Server.getInstance().commandes
					.remove(Server.getInstance().commandes.indexOf(c));
			return Response.status(Status.NO_CONTENT).build();
		} else
			return Response.status(Status.NOT_FOUND).build();
	}

}
