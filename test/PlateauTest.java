import static org.junit.Assert.*;

import org.junit.Test;

public class PlateauTest {
	
	Plateau p = new Plateau(10,10);

	@Test
	public void testgetChar() {
		assertEquals(p.getChar(10, 10),'B');
	}

}
