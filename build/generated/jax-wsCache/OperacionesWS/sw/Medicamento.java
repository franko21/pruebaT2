
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_medicamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listP" type="{http://sw/}pedido" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoM" type="{http://sw/}tipoMedicamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamento", propOrder = {
    "descripcion",
    "idMedicamento",
    "listP",
    "nombre",
    "tipoM"
})
public class Medicamento {

    protected String descripcion;
    @XmlElement(name = "id_medicamento")
    protected int idMedicamento;
    @XmlElement(nillable = true)
    protected List<Pedido> listP;
    protected String nombre;
    protected TipoMedicamento tipoM;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the idMedicamento property.
     * 
     */
    public int getIdMedicamento() {
        return idMedicamento;
    }

    /**
     * Sets the value of the idMedicamento property.
     * 
     */
    public void setIdMedicamento(int value) {
        this.idMedicamento = value;
    }

    /**
     * Gets the value of the listP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pedido }
     * 
     * 
     */
    public List<Pedido> getListP() {
        if (listP == null) {
            listP = new ArrayList<Pedido>();
        }
        return this.listP;
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

    /**
     * Gets the value of the tipoM property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMedicamento }
     *     
     */
    public TipoMedicamento getTipoM() {
        return tipoM;
    }

    /**
     * Sets the value of the tipoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMedicamento }
     *     
     */
    public void setTipoM(TipoMedicamento value) {
        this.tipoM = value;
    }

}
