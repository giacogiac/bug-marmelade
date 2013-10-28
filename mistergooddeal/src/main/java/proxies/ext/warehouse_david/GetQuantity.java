
package proxies.ext.warehouse_david;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://service.warehouse.external/}QuantityRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuantity", propOrder = {
    "message"
})
public class GetQuantity {

    protected QuantityRequest message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRequest }
     *     
     */
    public QuantityRequest getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRequest }
     *     
     */
    public void setMessage(QuantityRequest value) {
        this.message = value;
    }

}
