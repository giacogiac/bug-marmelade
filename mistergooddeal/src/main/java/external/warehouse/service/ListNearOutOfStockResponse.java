package external.warehouse.service;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import external.warehouse.data.Product;



@XmlType(name="ListNearOutOfStockResp")

public class ListNearOutOfStockResponse {
	@XmlElement(required=true, name="product")
	public List<Product> list;
}
