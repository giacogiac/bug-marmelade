
package proxies.ext.fedps_giac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEstimation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseEstimation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://fedps.giac.transport.external/}quote"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseEstimation", propOrder = {
    "quote"
})
public class ResponseEstimation {

    @XmlElement(required = true)
    protected Quote quote;

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link Quote }
     *     
     */
    public Quote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quote }
     *     
     */
    public void setQuote(Quote value) {
        this.quote = value;
    }

}
