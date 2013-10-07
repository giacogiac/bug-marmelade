package warehouse.service;

import javax.xml.bind.annotation.*;


@XmlType(name="LocationRequest")
public class LocationRequest {

	@XmlElement(required=true, name="product")
	public int idProduct;
}
