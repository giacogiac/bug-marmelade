package proxies.ext.warehouse_david;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T17:21:29.038+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://service.warehouse.external/", name = "WareHouseService")
@XmlSeeAlso({ObjectFactory.class})
public interface WareHouseService {

    @WebResult(name = "orderResponse", targetNamespace = "")
    @RequestWrapper(localName = "makeOrder", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.MakeOrder")
    @WebMethod
    @ResponseWrapper(localName = "makeOrderResponse", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.MakeOrderResponse")
    public proxies.ext.warehouse_david.OrderResp makeOrder(
        @WebParam(name = "request", targetNamespace = "")
        proxies.ext.warehouse_david.OrderRequest request
    );

    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getQuantity", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.GetQuantity")
    @WebMethod
    @ResponseWrapper(localName = "getQuantityResponse", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.GetQuantityResponse")
    public proxies.ext.warehouse_david.QuantityResp getQuantity(
        @WebParam(name = "message", targetNamespace = "")
        proxies.ext.warehouse_david.QuantityRequest message
    );

    @WebResult(name = "listNearOutOfStockResponse", targetNamespace = "")
    @RequestWrapper(localName = "listNearOutOfStock", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.ListNearOutOfStock")
    @WebMethod
    @ResponseWrapper(localName = "listNearOutOfStockResponse", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.ListNearOutOfStockResponse")
    public proxies.ext.warehouse_david.ListNearOutOfStockResp listNearOutOfStock();

    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getLocation", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.GetLocation")
    @WebMethod
    @ResponseWrapper(localName = "getLocationResponse", targetNamespace = "http://service.warehouse.external/", className = "proxies.ext.warehouse_david.GetLocationResponse")
    public proxies.ext.warehouse_david.LocationResp getLocation(
        @WebParam(name = "message", targetNamespace = "")
        proxies.ext.warehouse_david.LocationRequest message
    );
}
