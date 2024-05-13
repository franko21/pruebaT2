
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dis" type="{http://sw/}distribuidor" minOccurs="0"/&gt;
 *         &lt;element name="ID_pedido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="med" type="{http://sw/}medicamento" minOccurs="0"/&gt;
 *         &lt;element name="suc" type="{http://sw/}sucursal" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedido", propOrder = {
    "dis",
    "idPedido",
    "med",
    "suc",
    "total"
})
public class Pedido {

    protected Distribuidor dis;
    @XmlElement(name = "ID_pedido")
    protected int idPedido;
    protected Medicamento med;
    protected Sucursal suc;
    protected int total;

    /**
     * Gets the value of the dis property.
     * 
     * @return
     *     possible object is
     *     {@link Distribuidor }
     *     
     */
    public Distribuidor getDis() {
        return dis;
    }

    /**
     * Sets the value of the dis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribuidor }
     *     
     */
    public void setDis(Distribuidor value) {
        this.dis = value;
    }

    /**
     * Gets the value of the idPedido property.
     * 
     */
    public int getIDPedido() {
        return idPedido;
    }

    /**
     * Sets the value of the idPedido property.
     * 
     */
    public void setIDPedido(int value) {
        this.idPedido = value;
    }

    /**
     * Gets the value of the med property.
     * 
     * @return
     *     possible object is
     *     {@link Medicamento }
     *     
     */
    public Medicamento getMed() {
        return med;
    }

    /**
     * Sets the value of the med property.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicamento }
     *     
     */
    public void setMed(Medicamento value) {
        this.med = value;
    }

    /**
     * Gets the value of the suc property.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getSuc() {
        return suc;
    }

    /**
     * Sets the value of the suc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setSuc(Sucursal value) {
        this.suc = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
