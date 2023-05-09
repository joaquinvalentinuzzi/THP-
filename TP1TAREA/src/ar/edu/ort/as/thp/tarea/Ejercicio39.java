package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

/*39. Nos proponemos desarrollar un "Tiro al blanco" en el cual 2 o más participantes realizan 3 disparos consecutivos cada uno. Cada tiro, dependiendo de la distancia al centro da un puntaje que se acumula (se suman los tres disparos). Gana el jugador con mayor puntaje (se supone único). 
La puntuación para cada tiro es la siguiente: 
Si la distancia respecto al centro es O se ganan 500 puntos; 
Si la distancia es <= a 10, se ganan 250; 
• Si la distancia está entre 11 y 50 ganará 100 puntos; Si es mayor no ganará nada (cayó fuera del tablero). 
La mecánica del juego es la siguiente: 
Se pide la cantidad de jugadores (mayor o igual a 2). 
Por cada jugador: 
• Ingresar el nombre 
Se pide: 
Ingresar la distancia de cada uno de sus tres tiros consecutivos (número mayor o igual a cero), calculando para cada uno de estos el puntaje obtenido. 
Informar el nombre del participante ganador del torneo y su puntaje (suponer único máximo) 
Informar la cantidad total de tiros al centro. 

 * 
 * */

public class Ejercicio39 {
	private static Scanner input = new Scanner(System.in);
	final static int DISPARO_MENOR_CINCUENTA = 100;
	final static int DISPARO_MENOR_DIEZ = 250;
	final static int DISPARO_CENTRO = 500;
	final static int DISPAROS_TOTALES_JUGADOR = 3;
	final static int CANTIDAD_MINIMA_JUGADORES = 2;

	public static void main(String[] args) {
		int jugador = 0, cantidadJugadores, disparoJugador = 0,  distancia, puntajeMaximo = 0,
				disparosCentro = 0, puntoTotal = 0;

		String nombreJugador = "", nombreGanador = "";

		do {

			System.out.println("ingrese la cantidad de jugadores");
			cantidadJugadores = Integer.parseInt(input.nextLine());

		} while (cantidadJugadores < (CANTIDAD_MINIMA_JUGADORES));

		do {
			System.out.println("Ingrese el nombre del jugador");
			nombreJugador = input.nextLine();

		

			for ( disparoJugador = 0 ; disparoJugador < DISPAROS_TOTALES_JUGADOR; disparoJugador++) {
				
				

				do {
					System.out.println("ingrese la distancia del tiro " + (disparoJugador + 1));
					distancia = Integer.parseInt(input.nextLine());

				} while (distancia < 0);

			
					if (distancia == 0) {
						puntoTotal += DISPARO_CENTRO;
						disparosCentro++;
					} 
					if (distancia > 0 && distancia <= 10) {
						//puntosJugador += DISPARO_MENOR_DIEZ;
						puntoTotal += DISPARO_MENOR_DIEZ;

					} 
					if (distancia > 10 && distancia <= 50) {
						//puntosJugador += DISPARO_MENOR_CINCUENTA;
						puntoTotal += DISPARO_MENOR_CINCUENTA;

					}

			
					if (puntoTotal > puntajeMaximo) {
						puntajeMaximo = puntoTotal;
						nombreGanador = nombreJugador;

					}
					

			}
			
			puntoTotal = 0;


			
			
			

			jugador++;

		} while (jugador < cantidadJugadores);

		System.out.println("El ganador es " + nombreGanador + "con " + puntajeMaximo + " puntos");
		System.out.println("los tiros al centro en el juego fueron de: " + disparosCentro);

		
		input.close();
	}

}
