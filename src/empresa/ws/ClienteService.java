package empresa.ws;

import java.util.Scanner;

public class ClienteService {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		int horas;
		double tarifa;
		System.out.print("Horas trabajadas:  ");
		horas= sc.nextInt();
		System.out.print("Tarifa por hora:   ");
	 tarifa= sc.nextDouble();
	
	 
		CalculadoraImplService fac = new CalculadoraImplService();
		CalculadoraDao cliente = fac.getCalculadoraImplPort();
		System.out.print("Sueldo:  ");
		System.out.println(cliente.calcularSueldo(horas, tarifa));
	sc.close();
	}

}
