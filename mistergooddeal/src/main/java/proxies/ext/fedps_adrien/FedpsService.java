package proxies.ext.fedps_adrien;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T15:23:31.846+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://FedPS.adrien.transport/", name = "FedpsService")
@XmlSeeAlso({ObjectFactory.class})
public interface FedpsService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "devis", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.Devis")
    @WebMethod
    @ResponseWrapper(localName = "devisResponse", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.DevisResponse")
    public proxies.ext.fedps_adrien.VoucherClass devis(
        @WebParam(name = "list_packages", targetNamespace = "")
        java.util.List<proxies.ext.fedps_adrien.Package> listPackages
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "estimate_delivery_date", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.EstimateDeliveryDate")
    @WebMethod(operationName = "estimate_delivery_date")
    @ResponseWrapper(localName = "estimate_delivery_dateResponse", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.EstimateDeliveryDateResponse")
    public java.lang.String estimateDeliveryDate(
        @WebParam(name = "id_file", targetNamespace = "")
        java.lang.String idFile
    ) throws UnknownIdFile_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "order_delivery", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.OrderDelivery")
    @WebMethod(operationName = "order_delivery")
    @ResponseWrapper(localName = "order_deliveryResponse", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.OrderDeliveryResponse")
    public java.lang.String orderDelivery(
        @WebParam(name = "list_packages", targetNamespace = "")
        java.util.List<proxies.ext.fedps_adrien.Package> listPackages
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "price", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.Price")
    @WebMethod
    @ResponseWrapper(localName = "priceResponse", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.PriceResponse")
    public double price(
        @WebParam(name = "id_file", targetNamespace = "")
        java.lang.String idFile
    ) throws UnknownIdFile_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "track", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.Track")
    @WebMethod
    @ResponseWrapper(localName = "trackResponse", targetNamespace = "http://FedPS.adrien.transport/", className = "proxies.ext.fedps_adrien.TrackResponse")
    public proxies.ext.fedps_adrien.Tracking track(
        @WebParam(name = "id_file", targetNamespace = "")
        java.lang.String idFile
    ) throws UnknownIdFile_Exception;
}
