
package proxies.ext.fedps_giac;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T18:29:30.874+01:00
 * Generated source version: 2.5.1
 * 
 */
public final class DeliveryService_DeliveryServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://fedps.giac.transport.external/", "delivery");

    private DeliveryService_DeliveryServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Delivery.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Delivery ss = new Delivery(wsdlURL, SERVICE_NAME);
        DeliveryService port = ss.getDeliveryServicePort();  
        
        {
        System.out.println("Invoking order...");
        proxies.ext.fedps_giac.OrderRequest _order_message = null;
        try {
            proxies.ext.fedps_giac.ResponseOrder _order__return = port.order(_order_message);
            System.out.println("order.result=" + _order__return);

        } catch (DeliveryFault_Exception e) { 
            System.out.println("Expected exception: DeliveryFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking track...");
        proxies.ext.fedps_giac.TrackRequest _track_message = null;
        try {
            proxies.ext.fedps_giac.ResponseTrack _track__return = port.track(_track_message);
            System.out.println("track.result=" + _track__return);

        } catch (DeliveryFault_Exception e) { 
            System.out.println("Expected exception: DeliveryFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking estimation...");
        proxies.ext.fedps_giac.EstimationRequest _estimation_message = null;
        try {
            proxies.ext.fedps_giac.ResponseEstimation _estimation__return = port.estimation(_estimation_message);
            System.out.println("estimation.result=" + _estimation__return);

        } catch (DeliveryFault_Exception e) { 
            System.out.println("Expected exception: DeliveryFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
