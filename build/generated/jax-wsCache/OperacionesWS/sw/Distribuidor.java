
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distribuidor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distribuidor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_dis" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listP" type="{http://sw/}pedido" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "distribuidor", propOrder = {
    "idDis",
    "listP",
    "nombre"
})
public class Distribuidor {

    @XmlElement(name = "id_dis")
    protected int idDis;
    @XmlElement(nillable = true)
    protected List<Pedido> listP;
    protected String nombre;

    /**
     * Gets the value of the idDis property.
     * 
     */
    public int getIdDis() {
        return idDis;
    }

    /**
     * Sets the value of the idDis property.
     * 
     */
    public void setIdDis(int value) {
        this.idDis = value;
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

}
