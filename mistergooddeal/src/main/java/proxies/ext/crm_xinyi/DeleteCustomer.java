
package proxies.ext.crm_xinyi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://xinyi.crm.external/}DeleteCustomerRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCustomer", propOrder = {
    "message"
})
public class DeleteCustomer {

    protected DeleteCustomerRequest message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCustomerRequest }
     *     
     */
    public DeleteCustomerRequest getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCustomerRequest }
     *     
     */
    public void setMessage(DeleteCustomerRequest value) {
        this.message = value;
    }

}
