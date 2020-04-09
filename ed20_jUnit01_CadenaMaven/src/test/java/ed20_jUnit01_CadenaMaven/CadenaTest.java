package ed20_jUnit01_CadenaMaven;

import static org.junit.jupiter.api.Assertions.*;
import org.cuatrovientos.ed.Cadena;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	private Cadena frase;
	
	@BeforeEach
	void setUp() throws Exception {
		frase=new Cadena();
	}

	@Test
	void testLongitud() {
		int expected =7;
		int actual = frase.longitud("Maitane");
		assertEquals(expected, actual, "Longitud de la cadena");
		
		int expected1 =0;
		int actual1 = frase.longitud("");
		assertEquals(expected, actual, "Longitud de la cadena");
	}

	@Test
	void testVocales() {
		int expected = 2;
		int actual = frase.vocales("Hola");
		assertEquals(expected, actual, "Número de vocales");
		
		int expected1 = 0;
		int actual1 = frase.vocales("");
		assertEquals(expected, actual, "Número de vocales");
	}

	@Test
	void testInvertir() {
		String expected = "olah";
		String actual = frase.invertir("Hola");
		assertEquals(expected, actual, "Cadena invertida");
		
		String expected1 = "";
		String actual1 = frase.invertir("");
		assertEquals(expected, actual, "Cadena invertida");
	}

	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = frase.contarLetra("Hola", 'a');
		assertEquals(expected, actual, "Número de letra especifica");
		
		int expected1 = 0;
		int actual1 = frase.contarLetra("", 'a');
		assertEquals(expected, actual, "Número de letra especifica");
	}

}
