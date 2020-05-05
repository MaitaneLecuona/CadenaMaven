package org.cuatrovientos.ed;

import java.util.Random;

/**
 * Aplicacion para generar direcciones IP
 * @author maita
 *
 */
public class GeneradorIp {
	
	Random rnd = new Random();
	/**
	 * Función para generar numeros
	 * @param min
	 * @param max
	 * @return num
	 */
	public int generarNumero(int min, int max){		
		int num = rnd.nextInt(max);
		return num;
	}
	
	/**
	 * Funcion para generar las direcciones IP con los números generados antes
	 * @param num
	 * @return IP
	 */
	public String direccionIP() {
		String IP = "";		
		for (int i = 0; i < 3; i++) {
			int numero = generarNumero(1,255);		
			if (i == 3) {
				IP = (IP + numero);
			}else {
				IP = (numero + ".");
			}			
		}		
		return "IP";
	}
}
