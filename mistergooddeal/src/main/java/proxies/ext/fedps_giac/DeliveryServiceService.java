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
 * 2013-10-28T16:54:02.897+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "DeliveryServiceService", 
                  wsdlLocation = "file:/D:/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_giac.wsdl",
                  targetNamespace = "http://fedps.giac.transport/") 
public class DeliveryServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://fedps.giac.transport/", "DeliveryServiceService");
    public final static QName DeliveryPort = new QName("http://fedps.giac.transport/", "deliveryPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_giac.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeliveryServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_giac.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeliveryServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeliveryServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeliveryServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Delivery
     */
    @WebEndpoint(name = "deliveryPort")
    public Delivery getDeliveryPort() {
        return super.getPort(DeliveryPort, Delivery.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Delivery
     */
    @WebEndpoint(name = "deliveryPort")
    public Delivery getDeliveryPort(WebServiceFeature... features) {
        return super.getPort(DeliveryPort, Delivery.class, features);
    }

}