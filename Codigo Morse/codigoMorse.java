/**
 * Archivo: codigoMorse.java
 * Descripcion: Convierte una cadena de texto en codigo Morse, y viceversa.
 * @author Gonzalo Torres
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class codigoMorse {

	static String[] caracter = {"A","B","C","D","E","F","G","H","I","J","K",
		    					"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
		    					"1","2","3","4","5","6","7","8","9","0", " "};
	
	static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
			   				 ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
			   				 "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
			   				 "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
			   				 "-----", "   "};

	static String menu = "\n 1) Convertir de cadena de texto a codigo Morse." +
			  			 "\n 2) Convertir de codigo Morse a cadena de texto." +
			  			 "\n 0) Fin del programa.";
	
	//convierte cadena de texto en codigo Morse
	public static String convierteAMorse(String cadenaEntrada) {
		cadenaEntrada = cadenaEntrada.toUpperCase();
	    String cadenaSalida = "";
	    //almacenamos las palabras de entrada en un arreglo separadas por 3 espacios
	    String[] arrayCadenaEntrada = cadenaEntrada.split("   ");
	    
	    for(String componente : arrayCadenaEntrada) {
	    	for(int i = 0; i < componente.length(); i++) {
	    		for(int j = 0; j < morse.length; j++) {
	    			if(componente.substring(i, i + 1).equals(caracter[j])) {
	    				cadenaSalida = cadenaSalida + morse[j]+" ";
	    			}
	    		}
	    	}
	    	cadenaSalida = cadenaSalida + "  ";
	    }
	    return cadenaSalida;
	}
	    
	//convierte codigo Morse en cadena de texto
	public static String convierteATexto(String codigo) {
	    String cadenaSalida = "";
	    //almacenamos el codigo en un arreglo separado por tres espacios
	    String[] arrayCodigo = codigo.split("   ");
	    
	    for (String componente : arrayCodigo) {
	    	//separar la serie de puntos y lineas equivalentes a una letra 
	        for(String token : componente.split(" ")) {
	            for(int i = 0; i < morse.length; i++) {
	                if(token.equals(morse[i])) {
	                    cadenaSalida = cadenaSalida + caracter[i];
	                }
	            }
	        }
	        cadenaSalida = cadenaSalida + " ";
	    }	    
	    return cadenaSalida.toUpperCase();
	}
	
	//crea un menu de opciones
	public static int menuOpciones(String menu, Scanner input) {
		System.out.println(menu);
		System.out.println("Seleccione una opcion: ");
		return input.nextInt();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//obtener entrada de datos desde la consola
		Scanner input = new Scanner(System.in);
		
		String cadenaAConvertir;
		boolean continua = true;
		
		//presenta el menu
		int opcion = menuOpciones(menu, input);
		
		try {
			do {
				if (opcion == 1) {
					System.out.printf("Introduzca la cadena a convertir en código Morse: "); 
					cadenaAConvertir = bf.readLine();
	
					System.out.printf("El codigo Morse de %s es = %s \n", cadenaAConvertir, convierteAMorse(cadenaAConvertir));
					opcion = menuOpciones(menu, input);
				}
				if (opcion == 2) {
					System.out.printf("Introduzca el codigo Morse a convertir en cadena de texto (use tres espacios para delimitar cada palabra): "); 
					cadenaAConvertir = bf.readLine();
									
					System.out.printf("La cadena de texto de %s es = %s \n", cadenaAConvertir, convierteATexto(cadenaAConvertir));
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
