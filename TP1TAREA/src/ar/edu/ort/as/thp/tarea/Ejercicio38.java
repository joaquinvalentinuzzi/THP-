package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;
/*38. Realizá un programa que permita controlar con validación el ingreso a un sitio web.
 *  Teniendo ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa debe permitir al usuario ingresar sus credenciales.
 * 
 *  Si las mismas son erróneas, se volverán a pedir hasta un máximo de 3 intentos. Finalmente, 
 * la computadora debe mostrar alguno de los siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la cuenta". 
 * 
 * */
public class Ejercicio38 {

	private static Scanner input = new Scanner(System.in);
	final static int INTENTOS_MAXIMOS = 3;
	final static String USUARIO_VALIDO = "admin";
	final static String CONTRASENIA_VALIDA = "123465";

	public static void main(String[] args) {
		
		String usuario, contrasenia;
		int i=0;
		
	
		
		do {
			
			
			System.out.println("Ingrese su Usuario");
			 usuario = input.nextLine();
			
			System.out.println("Ingrese su contraseña");
			contrasenia = input.nextLine();
			
			System.out.println("intento numero " + (i+1));	
				
				i++;
			

			
			
			
			} while (!usuario.equals(USUARIO_VALIDO) && !contrasenia.equals(CONTRASENIA_VALIDA) && (i < INTENTOS_MAXIMOS));
	
		if (i>= INTENTOS_MAXIMOS) {
			System.out.println("Se ha bloqueado la cuenta");
			
		}else {
			System.out.println("Acceso consedido");
		}
		
		input.close();

	}

}
