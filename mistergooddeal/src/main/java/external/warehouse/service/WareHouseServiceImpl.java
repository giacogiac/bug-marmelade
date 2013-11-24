package external.warehouse.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.jws.*;

import external.warehouse.data.*;




@WebService(endpointInterface = "service.WareHouseService")
public class WareHouseServiceImpl implements WareHouseService {
	
	private Warehouse wh;
	
	
	public WareHouseServiceImpl() {
		super();
		this.wh = new Warehouse();
		Product CDs = new Product(1, 200, 500, "CDs");
		Product DVDs = new Product(3, 200, 100, "DVDs");
		wh.addProduct(CDs, "A");
		wh.addProduct(DVDs, "B");
		List listp = new ArrayList<Product>();
		listp.add(CDs);
		Delivery d1 = new Delivery("ups", "1/1/1",listp);
		wh.addDelivery(d1);
		
	}


	public LocationResponse getLocation(LocationRequest request){
		LocationResponse response = new LocationResponse();
		response.location = wh.getLocation(request.idProduct);
		return response;
	}

	public PlanningResponse getPlanning() {
		PlanningResponse response = new PlanningResponse();
		response.planning = wh.getPlanning();
		return response;
	}

	public ListNearOutOfStockResponse listNearOutOfStock() {
		ListNearOutOfStockResponse response = new ListNearOutOfStockResponse();
		response.list = wh.getListNearOutOfStock();
		return response;
	}

	public QuantityResponse getQuantity(QuantityRequest request) {
		QuantityResponse response = new QuantityResponse();
		response.quantity = wh.getProduct(request.idProduct).getQuantity();
		return response;
	}

	
	public OrderResponse makeOrder(OrderRequest request) {
		OrderResponse response = new OrderResponse();
		Order order = new Order(request.supplier, request.dateOfDelivery, request.listProduct);
		response.result = wh.addOrder(order);
		return response;
	}

	public DeliveryResponse haveDelivery(DeliveryRequest request) {
		DeliveryResponse response = new DeliveryResponse();
		Delivery delivery = new Delivery(request.supplier,request.dateOfDelivery,request.listProduct);
		response.result = wh.addDelivery(delivery);
		return response;
	}

}
