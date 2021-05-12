package empresa.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "empresa.ws.CalculadoraDao")
public class CalculadoraImpl implements CalculadoraDao {

	@Override
	public double calcularSueldo(int horas, double tarifa) {
	
		double sueldo=0;
		if (horas<41) {
			sueldo=horas*tarifa;
		}else {
			sueldo=(40*tarifa)+((horas-40)*(tarifa*1.5));
		}
		return sueldo;
	}

}
