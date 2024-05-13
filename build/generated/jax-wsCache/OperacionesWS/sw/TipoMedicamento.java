
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoMedicamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoMedicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_tmedicamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="med" type="{http://sw/}medicamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMedicamento", propOrder = {
    "idTmedicamento",
    "med",
    "nombre"
})
public class TipoMedicamento {

    @XmlElement(name = "id_tmedicamento")
    protected int idTmedicamento;
    @XmlElement(nillable = true)
    protected List<Medicamento> med;
    protected String nombre;

    /**
     * Gets the value of the idTmedicamento property.
     * 
     */
    public int getIdTmedicamento() {
        return idTmedicamento;
    }

    /**
     * Sets the value of the idTmedicamento property.
     * 
     */
    public void setIdTmedicamento(int value) {
        this.idTmedicamento = value;
    }

    /**
     * Gets the value of the med property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the med property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medicamento }
     * 
     * 
     */
    public List<Medicamento> getMed() {
        if (med == null) {
            med = new ArrayList<Medicamento>();
        }
        return this.med;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
