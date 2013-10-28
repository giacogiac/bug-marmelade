
package proxies.ext.fedps_adrien;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T16:38:41.968+01:00
 * Generated source version: 2.5.1
 * 
 */
public final class FedpsService_FedpsServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://FedPS.adrien.transport/", "Fedps");

    private FedpsService_FedpsServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Fedps.WSDL_LOCATION;
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
      
        Fedps ss = new Fedps(wsdlURL, SERVICE_NAME);
        FedpsService port = ss.getFedpsServicePort();  
        
        {
        System.out.println("Invoking devis...");
        java.util.List<proxies.ext.fedps_adrien.Package> _devis_listPackages = null;
        proxies.ext.fedps_adrien.VoucherClass _devis__return = port.devis(_devis_listPackages);
        System.out.println("devis.result=" + _devis__return);


        }
        {
        System.out.println("Invoking estimateDeliveryDate...");
        java.lang.String _estimateDeliveryDate_idFile = "";
        try {
            java.lang.String _estimateDeliveryDate__return = port.estimateDeliveryDate(_estimateDeliveryDate_idFile);
            System.out.println("estimateDeliveryDate.result=" + _estimateDeliveryDate__return);

        } catch (UnknownIdFile_Exception e) { 
            System.out.println("Expected exception: UnknownIdFile has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking orderDelivery...");
        java.util.List<proxies.ext.fedps_adrien.Package> _orderDelivery_listPackages = null;
        java.lang.String _orderDelivery__return = port.orderDelivery(_orderDelivery_listPackages);
        System.out.println("orderDelivery.result=" + _orderDelivery__return);


        }
        {
        System.out.println("Invoking price...");
        java.lang.String _price_idFile = "";
        try {
            double _price__return = port.price(_price_idFile);
            System.out.println("price.result=" + _price__return);

        } catch (UnknownIdFile_Exception e) { 
            System.out.println("Expected exception: UnknownIdFile has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking track...");
        java.lang.String _track_idFile = "";
        try {
            proxies.ext.fedps_adrien.Tracking _track__return = port.track(_track_idFile);
            System.out.println("track.result=" + _track__return);

        } catch (UnknownIdFile_Exception e) { 
            System.out.println("Expected exception: UnknownIdFile has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
