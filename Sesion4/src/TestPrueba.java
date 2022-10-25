import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrueba {
	
	@BeforeEach
	void setUp() {
		Cuenta.setSaldo(1000);
	}

	@Test
	public void testIngreso() {
		Cuenta.ingreso(1200);
		assertEquals(2200,Cuenta.getSaldo());
	}
	
	public void testReintegro() {
		Cuenta.ingreso(1000);
		assertEquals(0,Cuenta.getSaldo());
	}
	
	

}
