
package proxies.ext.warehouse_david;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listNearOutOfStockResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listNearOutOfStockResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listNearOutOfStockResponse" type="{http://service.warehouse.external/}ListNearOutOfStockResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listNearOutOfStockResponse", propOrder = {
    "listNearOutOfStockResponse"
})
public class ListNearOutOfStockResponse {

    protected ListNearOutOfStockResp listNearOutOfStockResponse;

    /**
     * Gets the value of the listNearOutOfStockResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ListNearOutOfStockResp }
     *     
     */
    public ListNearOutOfStockResp getListNearOutOfStockResponse() {
        return listNearOutOfStockResponse;
    }

    /**
     * Sets the value of the listNearOutOfStockResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListNearOutOfStockResp }
     *     
     */
    public void setListNearOutOfStockResponse(ListNearOutOfStockResp value) {
        this.listNearOutOfStockResponse = value;
    }

}
