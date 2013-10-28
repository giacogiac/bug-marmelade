package crm.ben.model;

import java.util.ArrayList;

public class Server {

	private long idCustomer = 0;
	private long idProduit = 0;
	private long idCommande = 0;

	public ArrayList<Customer> customers = new ArrayList<Customer>();
	public ArrayList<Produit> produits = new ArrayList<Produit>();
	public ArrayList<Commande> commandes = new ArrayList<Commande>();

	/** Constructeur priv�� */
	private Server() {

	}

	/** Instance unique pr��-initialis��e */
	private static Server INSTANCE = new Server();

	/** Point d'acc��s pour l'instance unique du singleton */
	public static Server getInstance() {
		return INSTANCE;
	}

	public long addCustomer(Customer c) {
		c.setId(idCustomer);
		idCustomer++;
		customers.add(c);
		return idCustomer - 1;
	}

	public long addCommande(Commande c) {
		c.setId(idCommande);
		idCommande++;
		commandes.add(c);
		return idCommande - 1;
	}

	public long addProduit(Produit c) {
		c.setId(idProduit);
		idProduit++;
		produits.add(c);
		return idProduit - 1;
	}

	public ArrayList<Produit> getPreferedProduits(long idCustomer) {
		ArrayList<Produit> prods = new ArrayList<Produit>();
		for (Commande c : commandes) {
			if (c.getIdCustomer() == idCustomer)
				for (Produit p : produits) {
					for(Long id:c.getIdProduit())
					if (id == p.getId())
						prods.add(p);
				}
		}

		return prods;
	}

	public ArrayList<Produit> searchProduits(String keyWord) {
		ArrayList<Produit> prods = new ArrayList<Produit>();

		for (Produit p : produits) {
			if (p.getCategorie().equals(keyWord))
				prods.add(p);
			else if (p.getDescription().equals(keyWord))
				prods.add(p);
			else if (p.getName().equals(keyWord))
				prods.add(p);
			else if (p.getReference().equals(keyWord))
				prods.add(p);
			
		}

		return prods;
	}
}
