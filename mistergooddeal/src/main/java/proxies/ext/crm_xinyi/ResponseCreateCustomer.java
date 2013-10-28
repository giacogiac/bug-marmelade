
package proxies.ext.crm_xinyi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseCreateCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseCreateCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseCreateCustomer", propOrder = {
    "idCustomer"
})
public class ResponseCreateCustomer {

    protected int idCustomer;

    /**
     * Gets the value of the idCustomer property.
     * 
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    /**
     * Sets the value of the idCustomer property.
     * 
     */
    public void setIdCustomer(int value) {
        this.idCustomer = value;
    }

}
