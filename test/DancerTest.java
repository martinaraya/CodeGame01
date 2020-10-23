import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DancerTest {

	@Test
	void testGetPosicionEn() {
		
		
		Dancer d = new Dancer();
		
		assertEquals(-4, d.getPosicionEnNew(3));
		assertEquals(-5, d.getPosicionEnNew(100000));
		assertEquals(1, d.getPosicionEnNew(2147483647));
		
	}

}
