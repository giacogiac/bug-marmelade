package crm.ben.model;

import java.util.ArrayList;


public class Server {	
	
	private long idCustomer=0;
	private long idProduit=0;
	private long idCommande=0;
	
	public ArrayList<Customer> customers=new ArrayList<Customer>();
	public ArrayList<Produit> produits=new ArrayList<Produit>();
	public ArrayList<Commande> commandes=new ArrayList<Commande>();
	/** Constructeur privé */
	private Server()
	{
		
	}
 
	/** Instance unique pré-initialisée */
	private static Server INSTANCE = new Server();
 
	/** Point d'accès pour l'instance unique du singleton */
	public static Server getInstance()
	{	
		return INSTANCE;
	}
	
	public long addCustomer(Customer c){
		c.setId(idCustomer);
		idCustomer++;
		customers.add(c);
		return idCustomer-1;
	}
	
	public long addCommande(Commande c){
		c.setId(idCommande);
		idCommande++;
		commandes.add(c);
		return idCommande-1;
	}
	public long addProduit(Produit c){
		c.setId(idProduit);
		idProduit++;
		produits.add(c);
		return idProduit-1;
	}
}
