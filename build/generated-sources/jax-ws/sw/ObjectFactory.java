
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarProducto_QNAME = new QName("http://sw/", "BuscarProducto");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://sw/", "BuscarProductoResponse");
    private final static QName _CrearPedido_QNAME = new QName("http://sw/", "CrearPedido");
    private final static QName _CrearPedidoResponse_QNAME = new QName("http://sw/", "CrearPedidoResponse");
    private final static QName _CrearProducto_QNAME = new QName("http://sw/", "CrearProducto");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://sw/", "CrearProductoResponse");
    private final static QName _EliminarProducto_QNAME = new QName("http://sw/", "EliminarProducto");
    private final static QName _EliminarProductoResponse_QNAME = new QName("http://sw/", "EliminarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link CrearPedido }
     * 
     */
    public CrearPedido createCrearPedido() {
        return new CrearPedido();
    }

    /**
     * Create an instance of {@link CrearPedidoResponse }
     * 
     */
    public CrearPedidoResponse createCrearPedidoResponse() {
        return new CrearPedidoResponse();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link EliminarProducto }
     * 
     */
    public EliminarProducto createEliminarProducto() {
        return new EliminarProducto();
    }

    /**
     * Create an instance of {@link EliminarProductoResponse }
     * 
     */
    public EliminarProductoResponse createEliminarProductoResponse() {
        return new EliminarProductoResponse();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Distribuidor }
     * 
     */
    public Distribuidor createDistribuidor() {
        return new Distribuidor();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link TipoMedicamento }
     * 
     */
    public TipoMedicamento createTipoMedicamento() {
        return new TipoMedicamento();
    }

    /**
     * Create an instance of {@link Sucursal }
     * 
     */
    public Sucursal createSucursal() {
        return new Sucursal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "BuscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "BuscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPedido }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearPedido")
    public JAXBElement<CrearPedido> createCrearPedido(CrearPedido value) {
        return new JAXBElement<CrearPedido>(_CrearPedido_QNAME, CrearPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPedidoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPedidoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearPedidoResponse")
    public JAXBElement<CrearPedidoResponse> createCrearPedidoResponse(CrearPedidoResponse value) {
        return new JAXBElement<CrearPedidoResponse>(_CrearPedidoResponse_QNAME, CrearPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "EliminarProducto")
    public JAXBElement<EliminarProducto> createEliminarProducto(EliminarProducto value) {
        return new JAXBElement<EliminarProducto>(_EliminarProducto_QNAME, EliminarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "EliminarProductoResponse")
    public JAXBElement<EliminarProductoResponse> createEliminarProductoResponse(EliminarProductoResponse value) {
        return new JAXBElement<EliminarProductoResponse>(_EliminarProductoResponse_QNAME, EliminarProductoResponse.class, null, value);
    }

}
