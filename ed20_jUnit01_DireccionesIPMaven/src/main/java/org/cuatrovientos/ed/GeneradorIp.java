package org.cuatrovientos.ed;

import java.util.Random;

/**
 * Aplicacion para generar direcciones IP
 * @author maita
 *
 */
public class GeneradorIp {
	
	
	/**
	 * Función para generar numeros
	 * @param min
	 * @param max
	 * @return num
	 */
	public int generarNumero(int min, int max){
		Random rnd = new Random();
		int num = rnd.nextInt(max);
		return num;
	}
	
	/**
	 * Funcion para generar las direcciones IP con los números generados antes
	 * @param num
	 * @return IP
	 */
	public String direccionIP() {
		return generarNumero(1,254)+"."+generarNumero(0,254)+"."+generarNumero(0,254)+generarNumero(1,254);
	}
}
