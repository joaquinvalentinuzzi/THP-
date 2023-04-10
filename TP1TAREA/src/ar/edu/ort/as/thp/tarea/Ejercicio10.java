package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio10 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String socio1,socio2,socio3;
		double aporteS1,aporteS2,aporteS3, aporteTotal,porcS1 , porcS2, porcS3 ;
		
		System.out.println("Ingrese el nombre del primer socio");
		socio1= input.nextLine();
		
		System.out.println("Cuanto aporto"+ socio1);
		aporteS1= Double.parseDouble(input.nextLine());
		
		
		System.out.println("Ingrese el nombre del segundo socio");
		socio2= input.nextLine();
		
		System.out.println("Cuanto aporto"+ socio2);
		aporteS2= Double.parseDouble(input.nextLine());
		
		
		System.out.println("Ingrese el nombre del tercer socio");
		socio3= input.nextLine();
		
		System.out.println("Cuanto aporto"+ socio3);
		aporteS3= Double.parseDouble(input.nextLine());
		
		
		aporteTotal = aporteS1 + aporteS2 + aporteS3;
		
		System.out.println("El aporte total fue de :" + aporteTotal );
		
		porcS1 = (aporteS1 * 100) / aporteTotal;
		porcS2 = (aporteS2 * 100) / aporteTotal;	
		porcS3 = (aporteS3 * 100) / aporteTotal;
		
		System.out.println(socio1 + "Aporto  un : "+ porcS1 + "%");
		System.out.println(socio2 + "Aporto  un : "+ porcS3 + "%" );
		System.out.println(socio3 + "Aporto  un : "+ porcS3 + "%" );


	}

}
