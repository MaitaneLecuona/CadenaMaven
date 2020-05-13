package ed20_jUnit01_FacturaMaven;

import static org.junit.jupiter.api.Assertions.*;
import ed20_jUnit01_FacturaMaven.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private Producto product;
	
	@BeforeEach
	void setUp() throws Exception {
		product = new Producto("pan", 1.05f,8);
	}

	@Test
	void testPrecioTotal() {
		float total = product.precioTotal();
		assertEquals(8.4,total);
	}

}
