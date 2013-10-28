
package proxies.ext.warehouse_david;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListNearOutOfStockResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListNearOutOfStockResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listProduct" type="{http://service.warehouse.external/}product" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListNearOutOfStockResp", propOrder = {
    "listProduct"
})
public class ListNearOutOfStockResp {

    @XmlElement(required = true)
    protected List<Product> listProduct;

    /**
     * Gets the value of the listProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getListProduct() {
        if (listProduct == null) {
            listProduct = new ArrayList<Product>();
        }
        return this.listProduct;
    }

    /**
     * Sets the value of the listProduct property.
     * 
     * @param listProduct
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

}
