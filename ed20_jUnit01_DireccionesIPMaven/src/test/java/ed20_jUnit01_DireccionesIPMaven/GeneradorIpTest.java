package ed20_jUnit01_DireccionesIPMaven;

import static org.junit.jupiter.api.Assertions.*;
import org.cuatrovientos.ed.GeneradorIp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;


class GeneradorIpTest extends TestCase{
	
	private GeneradorIp direccionIP;
	
	public GeneradorIpTest(String testMethodName) {
		super(testMethodName);
	}
		
	@BeforeEach
	protected void setUp() throws Exception {
		direccionIP = new GeneradorIp();
	}

	@Test
	void testGenerarNumero() {	
		int num = direccionIP.generarNumero(0,255);
		assertTrue("Voy a comparar si el número es mayor o igual que cero", num >= 0);
		assertTrue("Voy a comparar si el número es menor o igual que 255", num <= 255);
	}

	@Test
	void testDireccionIP() {
		String ip = direccionIP.direccionIP();
		assertFalse("El número por el que empieza es cero", ip.startsWith("0"));
	}
	
	public static TestSuite suite() {
		TestSuite mySuite = new ActiveTestSuite();
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("testGenerarNumero"),1));	
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("testGenerarNumero"),1000));
		return mySuite;
	}

}
