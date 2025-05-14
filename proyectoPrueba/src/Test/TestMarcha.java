package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.Coche;

class TestMarcha {
	
	Coche A1 = new Coche("Honda",150);

	@Test
	void test() {
		boolean valorEsperado = true;
		boolean valorObtenido = A1.meterMarcha(5);
		assertEquals(valorEsperado,valorObtenido);
	}
		// TODO Auto-generated method stub
		
	}


