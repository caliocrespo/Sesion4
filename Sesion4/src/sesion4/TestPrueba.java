package sesion4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrueba {
	static Cuenta cuenta1;
	static Cuenta cuenta2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() {
		cuenta1=new Cuenta("12345","Juanillo",50.0);
		cuenta2=new Cuenta("67890","betis",0.0);

	}

	@Test
	public void testCuenta1() {
		cuenta1.reintegro(200.0);
		cuenta1.ingreso(100.0);
		cuenta1.reintegro(200.0);
		assertEquals(-250.0,cuenta1.getSaldo());
	}
	
	@Test
	public void testCuenta2() {
		cuenta2.reintegro(350.0);
		cuenta2.reintegro(200.0);
		cuenta2.reintegro(150.0);
		cuenta2.ingreso(50.0);
		cuenta2.reintegro(100.0);
		assertEquals(-450.0,cuenta2.getSaldo());
	}
	
	

}
