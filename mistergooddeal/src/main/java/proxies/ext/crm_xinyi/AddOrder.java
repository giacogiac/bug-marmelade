
package proxies.ext.crm_xinyi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://xinyi.crm.external/}AddOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOrder", propOrder = {
    "message"
})
public class AddOrder {

    protected AddOrderRequest message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderRequest }
     *     
     */
    public AddOrderRequest getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderRequest }
     *     
     */
    public void setMessage(AddOrderRequest value) {
        this.message = value;
    }

}
