
package sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSCliente", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCliente {


    /**
     * 
     * @param usuario
     * @param contraseña
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://sw/", className = "sw.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://sw/", className = "sw.LoginResponse")
    @Action(input = "http://sw/WSCliente/LoginRequest", output = "http://sw/WSCliente/LoginResponse")
    public Boolean login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param valor
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Retiro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Retiro", targetNamespace = "http://sw/", className = "sw.Retiro")
    @ResponseWrapper(localName = "RetiroResponse", targetNamespace = "http://sw/", className = "sw.RetiroResponse")
    @Action(input = "http://sw/WSCliente/RetiroRequest", output = "http://sw/WSCliente/RetiroResponse")
    public Boolean retiro(
        @WebParam(name = "valor", targetNamespace = "")
        double valor,
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param usuario
     * @param saldo
     * @param contraseña
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "CrearCliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CrearCliente", targetNamespace = "http://sw/", className = "sw.CrearCliente")
    @ResponseWrapper(localName = "CrearClienteResponse", targetNamespace = "http://sw/", className = "sw.CrearClienteResponse")
    @Action(input = "http://sw/WSCliente/CrearClienteRequest", output = "http://sw/WSCliente/CrearClienteResponse")
    public Boolean crearCliente(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña,
        @WebParam(name = "saldo", targetNamespace = "")
        double saldo);

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "ObtenerSaldo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ObtenerSaldo", targetNamespace = "http://sw/", className = "sw.ObtenerSaldo")
    @ResponseWrapper(localName = "ObtenerSaldoResponse", targetNamespace = "http://sw/", className = "sw.ObtenerSaldoResponse")
    @Action(input = "http://sw/WSCliente/ObtenerSaldoRequest", output = "http://sw/WSCliente/ObtenerSaldoResponse")
    public Double obtenerSaldo(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param valor
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Deposito")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Deposito", targetNamespace = "http://sw/", className = "sw.Deposito")
    @ResponseWrapper(localName = "DepositoResponse", targetNamespace = "http://sw/", className = "sw.DepositoResponse")
    @Action(input = "http://sw/WSCliente/DepositoRequest", output = "http://sw/WSCliente/DepositoResponse")
    public Boolean deposito(
        @WebParam(name = "Valor", targetNamespace = "")
        double valor,
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param passtwo
     * @param passone
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "ValidarContra")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ValidarContra", targetNamespace = "http://sw/", className = "sw.ValidarContra")
    @ResponseWrapper(localName = "ValidarContraResponse", targetNamespace = "http://sw/", className = "sw.ValidarContraResponse")
    @Action(input = "http://sw/WSCliente/ValidarContraRequest", output = "http://sw/WSCliente/ValidarContraResponse")
    public Integer validarContra(
        @WebParam(name = "passone", targetNamespace = "")
        String passone,
        @WebParam(name = "passtwo", targetNamespace = "")
        String passtwo);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sw/", className = "sw.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sw/", className = "sw.HelloResponse")
    @Action(input = "http://sw/WSCliente/helloRequest", output = "http://sw/WSCliente/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
