package external.transport.adrien.FedPS;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.jws.WebService;

@WebService(endpointInterface = "FedPS.FedpsService")
public class FedpsServiceImpl implements FedpsService {
	
	static Hashtable<String, Voucher> ht = new Hashtable<String, Voucher>();

	public String order_delivery( ArrayList<Package> lists_packages) {
		Voucher vouch = new Voucher(lists_packages);
		ht.put(vouch.getId_file(), vouch);
		return vouch.getId_file();
	}

	public Voucher devis( ArrayList<Package> lists_packages) {
		Voucher vouch = new Voucher(lists_packages);
		ht.put(vouch.getId_file(), vouch);
		return vouch;
	}
	
	public String estimate_delivery_date( String id_file) throws UnknownIdFile {
		if (id_file.equals("ORDER_1234")) 
			return ht.get(id_file).getDelivery();
		else 
			throw new UnknownIdFile();
	}
	
	public double price( String id_file) throws UnknownIdFile {
		if (id_file.equals("ORDER_1234")) 
			return ht.get(id_file).getPrice();
		else 
			throw new UnknownIdFile();
	}
	
	public Tracking track( String id_file) throws UnknownIdFile {
		if (id_file.equals("ORDER_1234")) {
			Tracking track = new Tracking();
			track.setCurrent_location("centre de tri de Trifouilli les oies");
			track.setEstimate_delivery_date(ht.get(id_file).getDelivery());
			return track;
		}
		else 
			throw new UnknownIdFile();
	}
	
}
