package sesion4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrueba {
	static Cuenta cuenta1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() {
		cuenta1=new Cuenta("12345","Juanillo",50.0);

	}

	@Test
	public void testIngreso() {
		cuenta1.ingreso(100.0);
		assertEquals(150.0, cuenta1.getSaldo());
	}
	
	@Test
	public void testReintegro() {
		cuenta1.reintegro(30.0);
		assertEquals(20.0, cuenta1.getSaldo());
	}
	
	

}
