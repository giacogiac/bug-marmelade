
package proxies.ext.crm_xinyi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetCustomerPreferredProducts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetCustomerPreferredProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferredProducts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetCustomerPreferredProducts", propOrder = {
    "preferredProducts"
})
public class ResponseGetCustomerPreferredProducts {

    @XmlElement(name = "PreferredProducts", required = true)
    protected List<String> preferredProducts;

    /**
     * Gets the value of the preferredProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreferredProducts() {
        if (preferredProducts == null) {
            preferredProducts = new ArrayList<String>();
        }
        return this.preferredProducts;
    }

    /**
     * Sets the value of the preferredProducts property.
     * 
     * @param preferredProducts
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredProducts(List<String> preferredProducts) {
        this.preferredProducts = preferredProducts;
    }

}
