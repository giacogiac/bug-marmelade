
package proxies.ext.warehouse_david;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxies.ext.warehouse_david package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetQuantity_QNAME = new QName("http://service.warehouse.external/", "getQuantity");
    private final static QName _GetQuantityResponse_QNAME = new QName("http://service.warehouse.external/", "getQuantityResponse");
    private final static QName _GetLocationResponse_QNAME = new QName("http://service.warehouse.external/", "getLocationResponse");
    private final static QName _MakeOrderResponse_QNAME = new QName("http://service.warehouse.external/", "makeOrderResponse");
    private final static QName _MakeOrder_QNAME = new QName("http://service.warehouse.external/", "makeOrder");
    private final static QName _ListNearOutOfStock_QNAME = new QName("http://service.warehouse.external/", "listNearOutOfStock");
    private final static QName _ListNearOutOfStockResponse_QNAME = new QName("http://service.warehouse.external/", "listNearOutOfStockResponse");
    private final static QName _GetLocation_QNAME = new QName("http://service.warehouse.external/", "getLocation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxies.ext.warehouse_david
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link ListNearOutOfStockResponse }
     * 
     */
    public ListNearOutOfStockResponse createListNearOutOfStockResponse() {
        return new ListNearOutOfStockResponse();
    }

    /**
     * Create an instance of {@link ListNearOutOfStock }
     * 
     */
    public ListNearOutOfStock createListNearOutOfStock() {
        return new ListNearOutOfStock();
    }

    /**
     * Create an instance of {@link GetQuantityResponse }
     * 
     */
    public GetQuantityResponse createGetQuantityResponse() {
        return new GetQuantityResponse();
    }

    /**
     * Create an instance of {@link GetQuantity }
     * 
     */
    public GetQuantity createGetQuantity() {
        return new GetQuantity();
    }

    /**
     * Create an instance of {@link MakeOrder }
     * 
     */
    public MakeOrder createMakeOrder() {
        return new MakeOrder();
    }

    /**
     * Create an instance of {@link MakeOrderResponse }
     * 
     */
    public MakeOrderResponse createMakeOrderResponse() {
        return new MakeOrderResponse();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link LocationResp }
     * 
     */
    public LocationResp createLocationResp() {
        return new LocationResp();
    }

    /**
     * Create an instance of {@link OrderResp }
     * 
     */
    public OrderResp createOrderResp() {
        return new OrderResp();
    }

    /**
     * Create an instance of {@link ListNearOutOfStockResp }
     * 
     */
    public ListNearOutOfStockResp createListNearOutOfStockResp() {
        return new ListNearOutOfStockResp();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link LocationRequest }
     * 
     */
    public LocationRequest createLocationRequest() {
        return new LocationRequest();
    }

    /**
     * Create an instance of {@link QuantityResp }
     * 
     */
    public QuantityResp createQuantityResp() {
        return new QuantityResp();
    }

    /**
     * Create an instance of {@link QuantityRequest }
     * 
     */
    public QuantityRequest createQuantityRequest() {
        return new QuantityRequest();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "getQuantity")
    public JAXBElement<GetQuantity> createGetQuantity(GetQuantity value) {
        return new JAXBElement<GetQuantity>(_GetQuantity_QNAME, GetQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuantityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "getQuantityResponse")
    public JAXBElement<GetQuantityResponse> createGetQuantityResponse(GetQuantityResponse value) {
        return new JAXBElement<GetQuantityResponse>(_GetQuantityResponse_QNAME, GetQuantityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "getLocationResponse")
    public JAXBElement<GetLocationResponse> createGetLocationResponse(GetLocationResponse value) {
        return new JAXBElement<GetLocationResponse>(_GetLocationResponse_QNAME, GetLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "makeOrderResponse")
    public JAXBElement<MakeOrderResponse> createMakeOrderResponse(MakeOrderResponse value) {
        return new JAXBElement<MakeOrderResponse>(_MakeOrderResponse_QNAME, MakeOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "makeOrder")
    public JAXBElement<MakeOrder> createMakeOrder(MakeOrder value) {
        return new JAXBElement<MakeOrder>(_MakeOrder_QNAME, MakeOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNearOutOfStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "listNearOutOfStock")
    public JAXBElement<ListNearOutOfStock> createListNearOutOfStock(ListNearOutOfStock value) {
        return new JAXBElement<ListNearOutOfStock>(_ListNearOutOfStock_QNAME, ListNearOutOfStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNearOutOfStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "listNearOutOfStockResponse")
    public JAXBElement<ListNearOutOfStockResponse> createListNearOutOfStockResponse(ListNearOutOfStockResponse value) {
        return new JAXBElement<ListNearOutOfStockResponse>(_ListNearOutOfStockResponse_QNAME, ListNearOutOfStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.warehouse.external/", name = "getLocation")
    public JAXBElement<GetLocation> createGetLocation(GetLocation value) {
        return new JAXBElement<GetLocation>(_GetLocation_QNAME, GetLocation.class, null, value);
    }

}
