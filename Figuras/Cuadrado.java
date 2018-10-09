/**
 * Archivo: Cuadrado.java
 * Descripcion: Clase Cuadrado que calcula el Area y el Perimetro de un cuadrado en base al valor de "lado" 
 * 				proporcionado por el usuario.
 * @author Gonzalo Torres
 *
 */

public class Cuadrado {
	private int area;
	private int perimetro;
	
	/**
	 * @return el area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param calcula el area
	 */
	public void setArea(int lado) {
		this.area = lado * lado;
	}

	/**
	 * @return el perimetro
	 */
	public int getPerimetro() {
		return perimetro;
	}

	/**
	 * @param calcula el perimetro
	 */
	public void setPerimetro(int lado) {
		this.perimetro = lado * 4;
	}

}
