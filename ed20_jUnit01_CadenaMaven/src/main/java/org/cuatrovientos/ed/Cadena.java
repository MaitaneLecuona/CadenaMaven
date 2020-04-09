package org.cuatrovientos.ed;

/**
 * Aplicaci�n de cadenas 
 * @author maita
 *
 */
public class Cadena {
	
	/**
	 * Funci�n para saber la longitud de la cadena
	 * @param cadena
	 * @return longitud de la cadena
	 */
	public int longitud(String cadena) {
		return cadena.length();
	}

	/**
	 * Funci�n para contar las vocales de la cadena
	 * @param cadena
	 * @return n�mero de vocales de la cadena
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
	 * Funci�n para invertir la cadena 
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
	 * Funci�n para contar las veces que aparece una letra especifica
	 * @param cadena
	 * @param caracter
	 * @return n�mero de veces que aparece la letra
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
