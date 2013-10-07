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

import crm.ben.model.Produit;
import crm.ben.model.Server;


@Path("produit")
public class ProduitService {

	@GET
	@Path("/{produitId}")
	@Produces("text/json")
	public Response getCustomer(@PathParam("produitId") String produitId) {
		Produit c = new Produit();
		try {
			c.setId(Long.valueOf(produitId));
			if (Server.getInstance().produits.indexOf(c) != -1) {
				c = Server.getInstance().produits
						.get(Server.getInstance().produits.indexOf(c));
				return Response
						.status(Status.OK)
						.entity("{\"id\": \"" + String.valueOf(c.getId())
								+ "\", \"name\": \"" + c.getName() + "\", "
								+ "\"price\": \"" + c.getPrice() + "\", "
								+ "\"description\": \"" + c.getDescription()
								+ "\"}").build();
			}
		} catch (NumberFormatException e) {

		}
		return Response.status(Status.NOT_FOUND).build();
	}

	@POST
	@Path("/")
	@Produces("text/json")
	public Response creatProduit(@QueryParam("name") String name,
			@QueryParam("description") String description,
			@QueryParam("price") String price,
			@QueryParam("categorie") String categorie) {
		Produit c = new Produit();
		c.setName(name);
		c.setDescription(description);
		c.setPrice(Float.valueOf(price));
		c.setCategorie(categorie);

		return Response
				.status(Status.OK)
				.entity("{\"id\": \""
						+ String.valueOf(Server.getInstance().addProduit(c)
								+ "\"}")).build();

	}

	@DELETE
	@Path("/{produitId}")
	@Produces("text/json")
	public Response deleteCustomer(@PathParam("produitId") String produitId) {
		Produit c = new Produit();
		c.setId(Long.valueOf(produitId));
		if (Server.getInstance().produits.indexOf(c) != -1) {
			c = Server.getInstance().produits
					.remove(Server.getInstance().produits.indexOf(c));
			return Response.status(Status.NO_CONTENT).build();
		} else
			return Response.status(Status.NOT_FOUND).build();
	}

}
