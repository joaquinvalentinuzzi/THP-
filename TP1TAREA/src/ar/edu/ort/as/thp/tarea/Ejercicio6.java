package ar.edu.ort.as.thp.tarea;
/*6. Realizá un programa que permita ingresar el monto total de las ventas realizadas por un vendedor 
durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16 por ciento del monto total vendido. 
Con tales datos debes calcular y mostrar el importe a cobrar por el vendedor. */
import java.util.Scanner;

public class Ejercicio6 {
	static final Scanner input = new Scanner(System.in);
	static final double PORCENTAJE = 0.16;
	static final int COBRO_FIJO = 44000;
	

	public static void main(String[] args) {

		double montoTotaldeVentas,importeACobrar,porcentajeVentas;
		
		System.out.println("Ingrese el monto total de las ventas del mes");
		montoTotaldeVentas = Double.parseDouble(input.nextLine());
		
		porcentajeVentas = montoTotaldeVentas * PORCENTAJE;
		importeACobrar = porcentajeVentas + COBRO_FIJO;
		
		System.out.println("eL importe a cobrar es de : " + importeACobrar);
		
		input.close();
		
		
	}

}
