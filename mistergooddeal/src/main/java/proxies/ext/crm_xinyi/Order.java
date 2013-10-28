
package proxies.ext.crm_xinyi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="products" type="{http://xinyi.crm.external/}Product" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "identifier",
    "statu",
    "products"
})
public class Order {

    protected int identifier;
    @XmlElement(required = true)
    protected String statu;
    @XmlElement(required = true)
    protected List<Product> products;

    /**
     * Gets the value of the identifier property.
     * 
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     */
    public void setIdentifier(int value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the statu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatu() {
        return statu;
    }

    /**
     * Sets the value of the statu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatu(String value) {
        this.statu = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<Product>();
        }
        return this.products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param products
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
