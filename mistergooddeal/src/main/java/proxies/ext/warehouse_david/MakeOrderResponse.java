
package proxies.ext.warehouse_david;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderResponse" type="{http://service.warehouse.external/}OrderResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeOrderResponse", propOrder = {
    "orderResponse"
})
public class MakeOrderResponse {

    protected OrderResp orderResponse;

    /**
     * Gets the value of the orderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResp }
     *     
     */
    public OrderResp getOrderResponse() {
        return orderResponse;
    }

    /**
     * Sets the value of the orderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResp }
     *     
     */
    public void setOrderResponse(OrderResp value) {
        this.orderResponse = value;
    }

}
