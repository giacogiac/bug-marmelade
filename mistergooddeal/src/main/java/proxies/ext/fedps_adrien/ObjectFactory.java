
package proxies.ext.fedps_adrien;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxies.ext.fedps_adrien package. 
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

    private final static QName _Price_QNAME = new QName("http://fedps.adrien.transport.external/", "price");
    private final static QName _PriceResponse_QNAME = new QName("http://fedps.adrien.transport.external/", "priceResponse");
    private final static QName _DevisResponse_QNAME = new QName("http://fedps.adrien.transport.external/", "devisResponse");
    private final static QName _OrderDelivery_QNAME = new QName("http://fedps.adrien.transport.external/", "order_delivery");
    private final static QName _EstimateDeliveryDateResponse_QNAME = new QName("http://fedps.adrien.transport.external/", "estimate_delivery_dateResponse");
    private final static QName _Track_QNAME = new QName("http://fedps.adrien.transport.external/", "track");
    private final static QName _Devis_QNAME = new QName("http://fedps.adrien.transport.external/", "devis");
    private final static QName _EstimateDeliveryDate_QNAME = new QName("http://fedps.adrien.transport.external/", "estimate_delivery_date");
    private final static QName _UnknownIdFile_QNAME = new QName("http://fedps.adrien.transport.external/", "UnknownIdFile");
    private final static QName _OrderDeliveryResponse_QNAME = new QName("http://fedps.adrien.transport.external/", "order_deliveryResponse");
    private final static QName _TrackResponse_QNAME = new QName("http://fedps.adrien.transport.external/", "trackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxies.ext.fedps_adrien
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceResponse }
     * 
     */
    public PriceResponse createPriceResponse() {
        return new PriceResponse();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link OrderDelivery }
     * 
     */
    public OrderDelivery createOrderDelivery() {
        return new OrderDelivery();
    }

    /**
     * Create an instance of {@link DevisResponse }
     * 
     */
    public DevisResponse createDevisResponse() {
        return new DevisResponse();
    }

    /**
     * Create an instance of {@link EstimateDeliveryDateResponse }
     * 
     */
    public EstimateDeliveryDateResponse createEstimateDeliveryDateResponse() {
        return new EstimateDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link EstimateDeliveryDate }
     * 
     */
    public EstimateDeliveryDate createEstimateDeliveryDate() {
        return new EstimateDeliveryDate();
    }

    /**
     * Create an instance of {@link Devis }
     * 
     */
    public Devis createDevis() {
        return new Devis();
    }

    /**
     * Create an instance of {@link TrackResponse }
     * 
     */
    public TrackResponse createTrackResponse() {
        return new TrackResponse();
    }

    /**
     * Create an instance of {@link OrderDeliveryResponse }
     * 
     */
    public OrderDeliveryResponse createOrderDeliveryResponse() {
        return new OrderDeliveryResponse();
    }

    /**
     * Create an instance of {@link UnknownIdFile }
     * 
     */
    public UnknownIdFile createUnknownIdFile() {
        return new UnknownIdFile();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link VoucherClass }
     * 
     */
    public VoucherClass createVoucherClass() {
        return new VoucherClass();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Tracking }
     * 
     */
    public Tracking createTracking() {
        return new Tracking();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Price }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "price")
    public JAXBElement<Price> createPrice(Price value) {
        return new JAXBElement<Price>(_Price_QNAME, Price.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "priceResponse")
    public JAXBElement<PriceResponse> createPriceResponse(PriceResponse value) {
        return new JAXBElement<PriceResponse>(_PriceResponse_QNAME, PriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "devisResponse")
    public JAXBElement<DevisResponse> createDevisResponse(DevisResponse value) {
        return new JAXBElement<DevisResponse>(_DevisResponse_QNAME, DevisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "order_delivery")
    public JAXBElement<OrderDelivery> createOrderDelivery(OrderDelivery value) {
        return new JAXBElement<OrderDelivery>(_OrderDelivery_QNAME, OrderDelivery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateDeliveryDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "estimate_delivery_dateResponse")
    public JAXBElement<EstimateDeliveryDateResponse> createEstimateDeliveryDateResponse(EstimateDeliveryDateResponse value) {
        return new JAXBElement<EstimateDeliveryDateResponse>(_EstimateDeliveryDateResponse_QNAME, EstimateDeliveryDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Track }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "track")
    public JAXBElement<Track> createTrack(Track value) {
        return new JAXBElement<Track>(_Track_QNAME, Track.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Devis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "devis")
    public JAXBElement<Devis> createDevis(Devis value) {
        return new JAXBElement<Devis>(_Devis_QNAME, Devis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateDeliveryDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "estimate_delivery_date")
    public JAXBElement<EstimateDeliveryDate> createEstimateDeliveryDate(EstimateDeliveryDate value) {
        return new JAXBElement<EstimateDeliveryDate>(_EstimateDeliveryDate_QNAME, EstimateDeliveryDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownIdFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "UnknownIdFile")
    public JAXBElement<UnknownIdFile> createUnknownIdFile(UnknownIdFile value) {
        return new JAXBElement<UnknownIdFile>(_UnknownIdFile_QNAME, UnknownIdFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDeliveryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "order_deliveryResponse")
    public JAXBElement<OrderDeliveryResponse> createOrderDeliveryResponse(OrderDeliveryResponse value) {
        return new JAXBElement<OrderDeliveryResponse>(_OrderDeliveryResponse_QNAME, OrderDeliveryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedps.adrien.transport.external/", name = "trackResponse")
    public JAXBElement<TrackResponse> createTrackResponse(TrackResponse value) {
        return new JAXBElement<TrackResponse>(_TrackResponse_QNAME, TrackResponse.class, null, value);
    }

}
