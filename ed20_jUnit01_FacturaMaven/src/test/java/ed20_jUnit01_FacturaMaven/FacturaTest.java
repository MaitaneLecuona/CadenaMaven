package ed20_jUnit01_FacturaMaven;

import static org.junit.jupiter.api.Assertions.*;
import ed20_jUnit01_FacturaMaven.Factura;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	private Factura fact;
	Producto product = new Producto("pan", 0.05f,1);
	Producto product1 = new Producto("lechuga", 0.10f,10);
	
	@BeforeEach
	void setUp() throws Exception {
		fact = new Factura();
	}

	@Test
	void testTotalFactura() {
		fact.meterPoducto(product);
		fact.meterPoducto(product1);
	
		float result;
		result = fact.totalFactura();
		assertEquals(1.05, result);	
	}

	@Test
	void testAplicarIva() {
		fact.meterPoducto(product);
		fact.meterPoducto(product1);
		
		float result;
		result = fact.aplicarIva(0.50f);
		assertEquals(1,575,result);
	}

}
