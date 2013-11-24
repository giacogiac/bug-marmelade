
package proxies.ext.fedps_adrien;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dimensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hauteur" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="largeur" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longueur" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensions", propOrder = {
    "hauteur",
    "largeur",
    "longueur"
})
public class Dimensions {

    protected float hauteur;
    protected float largeur;
    protected float longueur;

    /**
     * Gets the value of the hauteur property.
     * 
     */
    public float getHauteur() {
        return hauteur;
    }

    /**
     * Sets the value of the hauteur property.
     * 
     */
    public void setHauteur(float value) {
        this.hauteur = value;
    }

    /**
     * Gets the value of the largeur property.
     * 
     */
    public float getLargeur() {
        return largeur;
    }

    /**
     * Sets the value of the largeur property.
     * 
     */
    public void setLargeur(float value) {
        this.largeur = value;
    }

    /**
     * Gets the value of the longueur property.
     * 
     */
    public float getLongueur() {
        return longueur;
    }

    /**
     * Sets the value of the longueur property.
     * 
     */
    public void setLongueur(float value) {
        this.longueur = value;
    }

}
