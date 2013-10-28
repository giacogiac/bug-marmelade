
package proxies.ext.fedps_adrien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="list_package" type="{http://fedps.adrien.transport.external/}package" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherClass", propOrder = {
    "delivery",
    "idFile",
    "listPackage",
    "price"
})
public class VoucherClass {

    protected String delivery;
    @XmlElement(name = "id_file")
    protected String idFile;
    @XmlElement(name = "list_package", nillable = true)
    protected List<Package> listPackage;
    protected double price;

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
     * Gets the value of the idFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFile() {
        return idFile;
    }

    /**
     * Sets the value of the idFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFile(String value) {
        this.idFile = value;
    }

    /**
     * Gets the value of the listPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Package }
     * 
     * 
     */
    public List<Package> getListPackage() {
        if (listPackage == null) {
            listPackage = new ArrayList<Package>();
        }
        return this.listPackage;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Sets the value of the listPackage property.
     * 
     * @param listPackage
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setListPackage(List<Package> listPackage) {
        this.listPackage = listPackage;
    }

}
