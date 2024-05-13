
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrearProducto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrearProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medicamento" type="{http://sw/}medicamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearProducto", propOrder = {
    "medicamento"
})
public class CrearProducto {

    protected Medicamento medicamento;

    /**
     * Gets the value of the medicamento property.
     * 
     * @return
     *     possible object is
     *     {@link Medicamento }
     *     
     */
    public Medicamento getMedicamento() {
        return medicamento;
    }

    /**
     * Sets the value of the medicamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicamento }
     *     
     */
    public void setMedicamento(Medicamento value) {
        this.medicamento = value;
    }

}
