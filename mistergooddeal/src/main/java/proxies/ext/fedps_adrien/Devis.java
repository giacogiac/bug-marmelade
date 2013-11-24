
package proxies.ext.fedps_adrien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for devis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="devis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list_packages" type="{http://fedps.adrien.transport.external/}package" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devis", propOrder = {
    "listPackages"
})
public class Devis {

    @XmlElement(name = "list_packages")
    protected List<Package> listPackages;

    /**
     * Gets the value of the listPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Package }
     * 
     * 
     */
    public List<Package> getListPackages() {
        if (listPackages == null) {
            listPackages = new ArrayList<Package>();
        }
        return this.listPackages;
    }

    /**
     * Sets the value of the listPackages property.
     * 
     * @param listPackages
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setListPackages(List<Package> listPackages) {
        this.listPackages = listPackages;
    }

}
