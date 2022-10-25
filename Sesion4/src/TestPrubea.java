import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrubea {

	@Test
	public void testIngreso() {
		Cuenta.ingreso(1200);
		assertEquals(1200,Cuenta.getSaldo());
	}
	
	public void testReintegro() {
		Cuenta.ingreso(1200);
		assertEquals(0,Cuenta.getSaldo());
	}
	
	

}
