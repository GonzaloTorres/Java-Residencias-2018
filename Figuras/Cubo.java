/**
 * Archivo: Cubo.java
 * Descripcion: Clase Cubo que calcula el Volumen en base a la dimension de "lado" proporcionada por el usuario.
 * 				Tambien se tiene la opcion de calcular el Perimetro, funcionalidad heredada de la clase Cuadrado. 
 * @author Gonzalo Torres
 *
 */
public class Cubo extends Cuadrado {

	private int volumen;
	
	//public Cubo() {		
	//}

	/**
	 * @return el volumen
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * @param calcula el volumen
	 */
	public void setVolumen(int lado) {
		this.volumen = lado * lado * lado;
	}

}
