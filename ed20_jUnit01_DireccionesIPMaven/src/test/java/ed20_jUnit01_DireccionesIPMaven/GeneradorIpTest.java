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
	
	//private GeneradorIp direccionIP;
	private GeneradorIp target = new GeneradorIp();
	
	public GeneradorIpTest(String testMethodName) {
		super(testMethodName);
	}
		
	@BeforeEach
	protected void setUp() throws Exception {
		target = new GeneradorIp();
	}

	@Test
	void testGenerarNumero() {	
		int num = target.generarNumero(0,254);
		assertTrue("Voy a comparar si el número es mayor o igual que cero", num >= 0);
		assertTrue("Voy a comparar si el número es menor o igual que 255", num <= 254);
	}

	@Test
	void testDireccionIP() {
		String[] octetos = target.direccionIP().split("\\.");
		assertFalse(octetos[0].equals("0") && octetos[3].equals("0"));
	}
	
	public static TestSuite suite() {
		TestSuite mySuite = new ActiveTestSuite();
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("testGenerarNumero"),10));	
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("testGenerarNumero"),1));
		return mySuite;
	}

}
