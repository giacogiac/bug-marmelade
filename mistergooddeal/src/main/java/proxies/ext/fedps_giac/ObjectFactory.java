
package proxies.ext.fedps_giac;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxies.ext.fedps_giac package. 
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

    private final static QName _OrderResponse_QNAME = new QName("http://fedps.giac.transport/", "orderResponse");
    private final static QName _Order_QNAME = new QName("http://fedps.giac.transport/", "order");
    private final static QName _Estimation_QNAME = new QName("http://fedps.giac.transport/", "estimation");
    private final static QName _EstimationRequest_QNAME = new QName("http://fedps.giac.transport/", "estimationRequest");
    private final static QName _OrderRequest_QNAME = new QName("http://fedps.giac.transport/", "orderRequest");
    private final static QName _Track_QNAME = new QName("http://fedps.giac.transport/", "track");
    private final static QName _Dimensions_QNAME = new QName("http://fedps.giac.transport/", "dimensions");
    private final static QName _EstimationResponse_QNAME = new QName("http://fedps.giac.transport/", "estimationResponse");
    private final static QName _DeliveryFault_QNAME = new QName("http://fedps.giac.transport/", "DeliveryFault");
    private final static QName _TrackRequest_QNAME = new QName("http://fedps.giac.transport/", "trackRequest");
    private final static QName _TrackResponse_QNAME = new QName("http://fedps.giac.transport/", "trackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxies.ext.fedps_giac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Estimation }
     * 
     */
    public Estimation createEstimation() {
        return new Estimation();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link EstimationRequest }
     * 
     */
    public EstimationRequest createEstimationRequest() {
        return new EstimationRequest();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link EstimationResponse }
     * 
     */
    public EstimationResponse createEstimationResponse() {
        return new EstimationResponse();
    }

    /**
     * Create an instance of {@link DeliveryFault }
     * 
     */
    public DeliveryFault createDeliveryFault() {
        return new DeliveryFault();
    }

    /**
     * Create an instance of {@link TrackResponse }
     * 
     */
    public TrackResponse createTrackResponse() {
        return new TrackResponse();
    }

    /**
     * Create an instance of {@link TrackRequest }
     * 
     */
    public TrackRequest createTrackRequest() {
        return new TrackRequest();
    }

    /**
     * Create an instance of {@link ResponseTrack }
     * 
     */
    public ResponseTrack createResponseTrack() {
        return new ResponseTrack();
    }

    /**
     * Create an instance of {@link ResponseOrder }
     * 
     */
    public ResponseOrder createResponseOrder() {
        return new ResponseOrder();
    }

    /**
     * Create an instance of {@link ResponseEstimation }
     * 
     */
    public ResponseEstimation createResponseEstimation() {
        return new ResponseEstimation();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "orderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estimation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "estimation")
    public JAXBElement<Estimation> createEstimation(Estimation value) {
        return new JAXBElement<Estimation>(_Estimation_QNAME, Estimation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "estimationRequest")
    public JAXBElement<EstimationRequest> createEstimationRequest(EstimationRequest value) {
        return new JAXBElement<EstimationRequest>(_EstimationRequest_QNAME, EstimationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "orderRequest")
    public JAXBElement<OrderRequest> createOrderRequest(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_OrderRequest_QNAME, OrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Track }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "track")
    public JAXBElement<Track> createTrack(Track value) {
        return new JAXBElement<Track>(_Track_QNAME, Track.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimensions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "dimensions")
    public JAXBElement<Dimensions> createDimensions(Dimensions value) {
        return new JAXBElement<Dimensions>(_Dimensions_QNAME, Dimensions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "estimationResponse")
    public JAXBElement<EstimationResponse> createEstimationResponse(EstimationResponse value) {
        return new JAXBElement<EstimationResponse>(_EstimationResponse_QNAME, EstimationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "DeliveryFault")
    public JAXBElement<DeliveryFault> createDeliveryFault(DeliveryFault value) {
        return new JAXBElement<DeliveryFault>(_DeliveryFault_QNAME, DeliveryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "trackRequest")
    public JAXBElement<TrackRequest> createTrackRequest(TrackRequest value) {
        return new JAXBElement<TrackRequest>(_TrackRequest_QNAME, TrackRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.giac.transport/", name = "trackResponse")
    public JAXBElement<TrackResponse> createTrackResponse(TrackResponse value) {
        return new JAXBElement<TrackResponse>(_TrackResponse_QNAME, TrackResponse.class, null, value);
    }

}
