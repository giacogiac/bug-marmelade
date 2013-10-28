package external.warehouse.data;

import java.util.*;


public class Warehouse {
	private HashMap<Integer, String> locationOfProduct;
	private HashMap<Integer, Product> listOfProduct;
	private ArrayList<Order> listOrder;
	
	public Warehouse() {
		super();
		this.locationOfProduct = new HashMap<Integer, String>();
		this.listOfProduct = new HashMap<Integer, Product>();
		this.listOrder = new ArrayList<Order>();
	}
	
	public boolean addOrder(Order o){
		return listOrder.add(o);
	}
	public boolean removeOrder(Order o){
		return listOrder.remove(o);
	}
	
	public String getLocation (int idProduct){
		return locationOfProduct.get(idProduct);
	}
	
	public Product getProduct (int idProduct){
		return listOfProduct.get(idProduct);
	}
	
	public void addProduct(Product p, String Location){
		listOfProduct.put(p.getId(), p);
		locationOfProduct.put(p.getId(), Location);
	}
	
	public void removeProduct(int id){
		locationOfProduct.remove(id);
		listOfProduct.remove(id);
	}
	
	public void removeNbProduct(int id, int q){
		listOfProduct.get(id).setQuantity(q);
	}
	public List<Product> getListNearOutOfStock(){
		ArrayList<Product> result = new ArrayList<Product>();
		for (Product p : listOfProduct.values()) {
			if(p.getQuantity() < p.getWarningLimit()){
				result.add(p);
			}
		}
		return result;
	}
	
}
