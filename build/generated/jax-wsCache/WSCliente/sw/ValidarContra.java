
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidarContra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidarContra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passtwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarContra", propOrder = {
    "passone",
    "passtwo"
})
public class ValidarContra {

    protected String passone;
    protected String passtwo;

    /**
     * Obtiene el valor de la propiedad passone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassone() {
        return passone;
    }

    /**
     * Define el valor de la propiedad passone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassone(String value) {
        this.passone = value;
    }

    /**
     * Obtiene el valor de la propiedad passtwo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasstwo() {
        return passtwo;
    }

    /**
     * Define el valor de la propiedad passtwo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasstwo(String value) {
        this.passtwo = value;
    }

}
