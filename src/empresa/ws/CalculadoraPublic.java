package empresa.ws;

import javax.xml.ws.Endpoint;



public class CalculadoraPublic {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:4040/SOAP/sueldo", new CalculadoraImpl());
		System.out.println("funcionando .... xxxx");
	}

}
