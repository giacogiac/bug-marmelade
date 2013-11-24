
package proxies.ext.warehouse_david;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for haveDeliveryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="haveDeliveryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryResponse" type="{http://service.warehouse.external/}DeliveryResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "haveDeliveryResponse", propOrder = {
    "deliveryResponse"
})
public class HaveDeliveryResponse {

    protected DeliveryResp deliveryResponse;

    /**
     * Gets the value of the deliveryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResp }
     *     
     */
    public DeliveryResp getDeliveryResponse() {
        return deliveryResponse;
    }

    /**
     * Sets the value of the deliveryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResp }
     *     
     */
    public void setDeliveryResponse(DeliveryResp value) {
        this.deliveryResponse = value;
    }

}
