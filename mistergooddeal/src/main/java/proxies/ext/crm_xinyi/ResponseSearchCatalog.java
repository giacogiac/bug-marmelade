
package proxies.ext.crm_xinyi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseSearchCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseSearchCatalog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productsFound" type="{http://xinyi.crm.external/}Product" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseSearchCatalog", propOrder = {
    "productsFound"
})
public class ResponseSearchCatalog {

    @XmlElement(required = true)
    protected List<Product> productsFound;

    /**
     * Gets the value of the productsFound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productsFound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductsFound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProductsFound() {
        if (productsFound == null) {
            productsFound = new ArrayList<Product>();
        }
        return this.productsFound;
    }

    /**
     * Sets the value of the productsFound property.
     * 
     * @param productsFound
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductsFound(List<Product> productsFound) {
        this.productsFound = productsFound;
    }

}
