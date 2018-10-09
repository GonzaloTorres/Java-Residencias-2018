/**
 * Archivo: numerosRomanos.java
 * Descripcion: Convierte un numero natural en numero romano.
 * @author Gonzalo Torres
 */

import java.util.Scanner;
import java.io.*;

public class numerosRomanos {

    static String[] romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] numero = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	
    //convierte numero decimal a romano
    public static String convierteARomano(int valorEntrada) {
    	String cadenaSalida = "";
    	
    	//verificamos que el valor de entrada este en un rango de 1 a 1000
    	if (valorEntrada >= 1 && valorEntrada <= 1000) {
    		//cotejamos el valor de entrada con el numero de elementos en el arreglo y asignamos el valor si se encuentra
    		for (int i = 0; i < 13; i++) {
    			//construye la cadena de numeros romanos
    			while (valorEntrada >= numero[i]) {
    				valorEntrada = valorEntrada - numero[i];
    				cadenaSalida = cadenaSalida + romano[i];
    			}
    		}
    	}
    	else {
    		System.out.printf("El número introducido no es válido. Solo aplica para números entre 1 y 1000.\n");
    	}
    	return cadenaSalida;
    }
    
    
	public static void main(String[] args) throws IOException {
		//obtener entrada de datos desde la consola
		Scanner input = new Scanner(System.in);

		try {
			int numeroAConvertir;
			String numeroRomano;
			
			System.out.printf("Introduzca un número entre 1 y 1000 a convertir en número romano: "); 
			numeroAConvertir = input.nextInt();

			numeroRomano = convierteARomano(numeroAConvertir);
			
			if (numeroRomano != "") {
				System.out.printf("El número romano equivalente de %s es %s \n", numeroAConvertir, numeroRomano);
			}
		}
		finally {
			input.close();
		}
	}
	
}
