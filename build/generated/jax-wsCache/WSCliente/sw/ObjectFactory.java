
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

    private final static QName _CrearCliente_QNAME = new QName("http://sw/", "CrearCliente");
    private final static QName _CrearClienteResponse_QNAME = new QName("http://sw/", "CrearClienteResponse");
    private final static QName _Deposito_QNAME = new QName("http://sw/", "Deposito");
    private final static QName _DepositoResponse_QNAME = new QName("http://sw/", "DepositoResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "LoginResponse");
    private final static QName _ObtenerSaldo_QNAME = new QName("http://sw/", "ObtenerSaldo");
    private final static QName _ObtenerSaldoResponse_QNAME = new QName("http://sw/", "ObtenerSaldoResponse");
    private final static QName _Retiro_QNAME = new QName("http://sw/", "Retiro");
    private final static QName _RetiroResponse_QNAME = new QName("http://sw/", "RetiroResponse");
    private final static QName _ValidarContra_QNAME = new QName("http://sw/", "ValidarContra");
    private final static QName _ValidarContraResponse_QNAME = new QName("http://sw/", "ValidarContraResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link Deposito }
     * 
     */
    public Deposito createDeposito() {
        return new Deposito();
    }

    /**
     * Create an instance of {@link DepositoResponse }
     * 
     */
    public DepositoResponse createDepositoResponse() {
        return new DepositoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ObtenerSaldo }
     * 
     */
    public ObtenerSaldo createObtenerSaldo() {
        return new ObtenerSaldo();
    }

    /**
     * Create an instance of {@link ObtenerSaldoResponse }
     * 
     */
    public ObtenerSaldoResponse createObtenerSaldoResponse() {
        return new ObtenerSaldoResponse();
    }

    /**
     * Create an instance of {@link Retiro }
     * 
     */
    public Retiro createRetiro() {
        return new Retiro();
    }

    /**
     * Create an instance of {@link RetiroResponse }
     * 
     */
    public RetiroResponse createRetiroResponse() {
        return new RetiroResponse();
    }

    /**
     * Create an instance of {@link ValidarContra }
     * 
     */
    public ValidarContra createValidarContra() {
        return new ValidarContra();
    }

    /**
     * Create an instance of {@link ValidarContraResponse }
     * 
     */
    public ValidarContraResponse createValidarContraResponse() {
        return new ValidarContraResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearCliente")
    public JAXBElement<CrearCliente> createCrearCliente(CrearCliente value) {
        return new JAXBElement<CrearCliente>(_CrearCliente_QNAME, CrearCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "CrearClienteResponse")
    public JAXBElement<CrearClienteResponse> createCrearClienteResponse(CrearClienteResponse value) {
        return new JAXBElement<CrearClienteResponse>(_CrearClienteResponse_QNAME, CrearClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Deposito")
    public JAXBElement<Deposito> createDeposito(Deposito value) {
        return new JAXBElement<Deposito>(_Deposito_QNAME, Deposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DepositoResponse")
    public JAXBElement<DepositoResponse> createDepositoResponse(DepositoResponse value) {
        return new JAXBElement<DepositoResponse>(_DepositoResponse_QNAME, DepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "ObtenerSaldo")
    public JAXBElement<ObtenerSaldo> createObtenerSaldo(ObtenerSaldo value) {
        return new JAXBElement<ObtenerSaldo>(_ObtenerSaldo_QNAME, ObtenerSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "ObtenerSaldoResponse")
    public JAXBElement<ObtenerSaldoResponse> createObtenerSaldoResponse(ObtenerSaldoResponse value) {
        return new JAXBElement<ObtenerSaldoResponse>(_ObtenerSaldoResponse_QNAME, ObtenerSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retiro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retiro }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Retiro")
    public JAXBElement<Retiro> createRetiro(Retiro value) {
        return new JAXBElement<Retiro>(_Retiro_QNAME, Retiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetiroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetiroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "RetiroResponse")
    public JAXBElement<RetiroResponse> createRetiroResponse(RetiroResponse value) {
        return new JAXBElement<RetiroResponse>(_RetiroResponse_QNAME, RetiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarContra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarContra }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "ValidarContra")
    public JAXBElement<ValidarContra> createValidarContra(ValidarContra value) {
        return new JAXBElement<ValidarContra>(_ValidarContra_QNAME, ValidarContra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarContraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarContraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "ValidarContraResponse")
    public JAXBElement<ValidarContraResponse> createValidarContraResponse(ValidarContraResponse value) {
        return new JAXBElement<ValidarContraResponse>(_ValidarContraResponse_QNAME, ValidarContraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
