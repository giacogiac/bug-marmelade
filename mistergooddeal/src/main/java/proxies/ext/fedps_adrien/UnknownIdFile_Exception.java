
package proxies.ext.fedps_adrien;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-10-28T16:55:56.538+01:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "UnknownIdFile", targetNamespace = "http://FedPS.adrien.transport/")
public class UnknownIdFile_Exception extends Exception {
    
    private proxies.ext.fedps_adrien.UnknownIdFile unknownIdFile;

    public UnknownIdFile_Exception() {
        super();
    }
    
    public UnknownIdFile_Exception(String message) {
        super(message);
    }
    
    public UnknownIdFile_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownIdFile_Exception(String message, proxies.ext.fedps_adrien.UnknownIdFile unknownIdFile) {
        super(message);
        this.unknownIdFile = unknownIdFile;
    }

    public UnknownIdFile_Exception(String message, proxies.ext.fedps_adrien.UnknownIdFile unknownIdFile, Throwable cause) {
        super(message, cause);
        this.unknownIdFile = unknownIdFile;
    }

    public proxies.ext.fedps_adrien.UnknownIdFile getFaultInfo() {
        return this.unknownIdFile;
    }
}
