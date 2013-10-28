
package proxies.ext.warehouse_david;

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
 * 2013-10-28T17:16:45.624+01:00
 * Generated source version: 2.5.1
 * 
 */
public final class WareHouseService_WareHouseServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.warehouse.external/", "WareHouse");

    private WareHouseService_WareHouseServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WareHouse.WSDL_LOCATION;
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
      
        WareHouse ss = new WareHouse(wsdlURL, SERVICE_NAME);
        WareHouseService port = ss.getWareHouseServicePort();  
        
        {
        System.out.println("Invoking makeOrder...");
        proxies.ext.warehouse_david.OrderRequest _makeOrder_request = null;
        proxies.ext.warehouse_david.OrderResp _makeOrder__return = port.makeOrder(_makeOrder_request);
        System.out.println("makeOrder.result=" + _makeOrder__return);


        }
        {
        System.out.println("Invoking getQuantity...");
        proxies.ext.warehouse_david.QuantityRequest _getQuantity_message = null;
        proxies.ext.warehouse_david.QuantityResp _getQuantity__return = port.getQuantity(_getQuantity_message);
        System.out.println("getQuantity.result=" + _getQuantity__return);


        }
        {
        System.out.println("Invoking listNearOutOfStock...");
        proxies.ext.warehouse_david.ListNearOutOfStockResp _listNearOutOfStock__return = port.listNearOutOfStock();
        System.out.println("listNearOutOfStock.result=" + _listNearOutOfStock__return);


        }
        {
        System.out.println("Invoking getLocation...");
        proxies.ext.warehouse_david.LocationRequest _getLocation_message = null;
        proxies.ext.warehouse_david.LocationResp _getLocation__return = port.getLocation(_getLocation_message);
        System.out.println("getLocation.result=" + _getLocation__return);


        }

        System.exit(0);
    }

}
