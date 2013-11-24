
package proxies.ext.crm_xinyi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseDeleteCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDeleteCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDeleteCustomer", propOrder = {
    "remove"
})
public class ResponseDeleteCustomer {

    protected boolean remove;

    /**
     * Gets the value of the remove property.
     * This getter has been renamed from isRemove() to getRemove() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRemove() {
        return remove;
    }

    /**
     * Sets the value of the remove property.
     * 
     */
    public void setRemove(boolean value) {
        this.remove = value;
    }

}
