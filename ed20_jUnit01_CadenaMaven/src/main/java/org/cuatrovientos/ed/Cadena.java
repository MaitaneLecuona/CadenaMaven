package org.cuatrovientos.ed;

/**
 * Aplicación de cadenas 
 * @author maita
 *
 */
public class Cadena {
	
	/**
	 * Función para saber la longitud de la cadena
	 * @param cadena
	 * @return longitud de la cadena
	 */
	public int longitud(String cadena) {
		return cadena.length();
	}

	/**
	 * Función para contar las vocales de la cadena
	 * @param cadena
	 * @return número de vocales de la cadena
	 */
	public int vocales(String cadena) {
		int vocales = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
				vocales++;
			}
		}
		return vocales;
	}
	
	/**
	 * Función para invertir la cadena 
	 * @param cadena
	 * @return cadena invertida
	 */
	public String invertir(String cadena) {
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida = invertida + cadena.charAt(i);
		}
		return invertida;
	}

	/**
	 * Función para contar las veces que aparece una letra especifica
	 * @param cadena
	 * @param caracter
	 * @return número de veces que aparece la letra
	 */
	public int contarLetra(String cadena, char caracter) {
		int posicion, contador = 0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
			contador++;
			posicion = cadena.indexOf(caracter, posicion + 1);
		}
		return contador;
	}
}
