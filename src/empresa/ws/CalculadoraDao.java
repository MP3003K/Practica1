
package empresa.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculadoraDao", targetNamespace = "http://ws.empresa/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculadoraDao {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcularSueldo", targetNamespace = "http://ws.empresa/", className = "empresa.ws.CalcularSueldo")
    @ResponseWrapper(localName = "calcularSueldoResponse", targetNamespace = "http://ws.empresa/", className = "empresa.ws.CalcularSueldoResponse")
    @Action(input = "http://ws.empresa/CalculadoraDao/calcularSueldoRequest", output = "http://ws.empresa/CalculadoraDao/calcularSueldoResponse")
    public double calcularSueldo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
