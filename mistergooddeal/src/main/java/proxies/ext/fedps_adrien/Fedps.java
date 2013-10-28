package proxies.ext.fedps_adrien;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T16:38:42.047+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "Fedps", 
                  wsdlLocation = "file:/C:/Users/Xadi/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_andrien.wsdl",
                  targetNamespace = "http://FedPS.adrien.transport/") 
public class Fedps extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://FedPS.adrien.transport/", "Fedps");
    public final static QName FedpsServicePort = new QName("http://FedPS.adrien.transport/", "FedpsServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Xadi/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_andrien.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Fedps.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Xadi/git/bug-marmelade/mistergooddeal/src/main/resources/fedps_andrien.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Fedps(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Fedps(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Fedps() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fedps(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fedps(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fedps(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FedpsService
     */
    @WebEndpoint(name = "FedpsServicePort")
    public FedpsService getFedpsServicePort() {
        return super.getPort(FedpsServicePort, FedpsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FedpsService
     */
    @WebEndpoint(name = "FedpsServicePort")
    public FedpsService getFedpsServicePort(WebServiceFeature... features) {
        return super.getPort(FedpsServicePort, FedpsService.class, features);
    }

}
