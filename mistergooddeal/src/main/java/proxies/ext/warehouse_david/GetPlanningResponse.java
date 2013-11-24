
package proxies.ext.warehouse_david;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanningResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPlanningResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planningResponse" type="{http://service.warehouse.external/}PlanningResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanningResponse", propOrder = {
    "planningResponse"
})
public class GetPlanningResponse {

    protected PlanningResp planningResponse;

    /**
     * Gets the value of the planningResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningResp }
     *     
     */
    public PlanningResp getPlanningResponse() {
        return planningResponse;
    }

    /**
     * Sets the value of the planningResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningResp }
     *     
     */
    public void setPlanningResponse(PlanningResp value) {
        this.planningResponse = value;
    }

}
