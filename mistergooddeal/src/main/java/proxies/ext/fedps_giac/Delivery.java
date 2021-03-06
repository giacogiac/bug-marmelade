package proxies.ext.fedps_giac;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T18:29:30.952+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "delivery", 
                  wsdlLocation = "file:./src/main/resources/fedps_giac.wsdl",
                  targetNamespace = "http://fedps.giac.transport.external/") 
public class Delivery extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://fedps.giac.transport.external/", "delivery");
    public final static QName DeliveryServicePort = new QName("http://fedps.giac.transport.external/", "DeliveryServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:./src/main/resources/fedps_giac.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Delivery.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:./src/main/resources/fedps_giac.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Delivery(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Delivery(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Delivery() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns DeliveryService
     */
    @WebEndpoint(name = "DeliveryServicePort")
    public DeliveryService getDeliveryServicePort() {
        return super.getPort(DeliveryServicePort, DeliveryService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeliveryService
     */
    @WebEndpoint(name = "DeliveryServicePort")
    public DeliveryService getDeliveryServicePort(WebServiceFeature... features) {
        return super.getPort(DeliveryServicePort, DeliveryService.class, features);
    }

}
