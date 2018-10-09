/**
 * Archivo: Figuras.java
 * Descripcion: Programa principal que pide el valor de un lado y calcula el area y perimetro de un cuadrado,
 * 				y el perimetro y el volumen de un cubo.
 * @author Gonzalo Torres
 *
 */

import java.util.Scanner;
import java.io.IOException;

public class Figuras {

	static String menu = "\n 1) Calcular el área de un cuadrado." +
 			 			 "\n 2) Calcular el perímetro de un cuadrado." +
 			 			 "\n 3) Calcular el perímetro de un cubo." +
 			 			 "\n 4) Calcular el volumen de un cubo." +
 			 			 "\n 0) Fin del programa.";

	//crea un menu de opciones
	public static int menuOpciones(String menu, Scanner input) {
		System.out.println(menu);
		System.out.println("Seleccione una opcion: ");
		return input.nextInt();
	}

	public static void main(String[] args) throws IOException {
		// se crean las clases a utilizar
		Cuadrado cuad = new Cuadrado();
		Cubo cub = new Cubo();
		
		//obtener entrada de datos desde la consola
		Scanner input = new Scanner(System.in);
		
		boolean continua = true;
		int lado;	
		int opcion;
		
		System.out.println("Proporcione el valor del lado: ");
		lado = Integer.parseInt(input.nextLine());
		
		//presenta el menu
		opcion = menuOpciones(menu, input);	

		try {
			do {
				if (opcion == 1) {
					cuad.setArea(lado);
					System.out.printf("El area del cuadrado es %d \n", cuad.getArea());
					
					opcion = menuOpciones(menu, input);
				}
				if (opcion == 2) {
					cuad.setPerimetro(lado);
					System.out.printf("El perimetro del cuadrado es %d \n", cuad.getPerimetro());
									
					opcion = menuOpciones(menu, input);
				}
				if (opcion == 3) {
					cub.setPerimetro(lado);
					System.out.printf("El perimetro del cubo es %d \n", cub.getPerimetro());
									
					opcion = menuOpciones(menu, input);
				}
				if (opcion == 4) {
					cub.setVolumen(lado);
					System.out.printf("El volumen del cubo es %d \n", cub.getVolumen());
									
					opcion = menuOpciones(menu, input);
				}
				else if (opcion == 0) {
					System.out.println("Fin del programa.");
					continua = false;
				}
				else {
					System.out.println("Introduzca un número de opción válido.");
					opcion = menuOpciones(menu, input);
				}
			}
			while (continua);
		}
		finally {
			input.close();
		}
		
	}

}
