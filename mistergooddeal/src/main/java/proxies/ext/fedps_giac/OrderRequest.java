
package proxies.ext.fedps_giac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pickup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delivery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimensions" type="{http://fedps.giac.transport/}dimensions"/>
 *         &lt;element name="weigth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderRequest", propOrder = {
    "pickup",
    "delivery",
    "dimensions",
    "weigth"
})
public class OrderRequest {

    @XmlElement(required = true)
    protected String pickup;
    @XmlElement(required = true)
    protected String delivery;
    @XmlElement(required = true)
    protected Dimensions dimensions;
    protected int weigth;

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickup() {
        return pickup;
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickup(String value) {
        this.pickup = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivery(String value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the weigth property.
     * 
     */
    public int getWeigth() {
        return weigth;
    }

    /**
     * Sets the value of the weigth property.
     * 
     */
    public void setWeigth(int value) {
        this.weigth = value;
    }

}
