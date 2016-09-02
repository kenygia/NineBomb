import static org.junit.Assert.*;

import org.junit.Test;

public class PlateauTest {
	
	Personnage p1 = new Personnage("p1", new int[]{1,1});
	Personnage p2 = new Personnage("p2", new int[]{8,8});
	Plateau p = new Plateau(p1,p2);

	@Test
	public void testgetCharPerso1() {
		assertEquals(p.getChar(1,1), '1');
	}
	
	@Test
	public void testgetCharPerso2() {
		assertEquals(p.getChar(8,8), '2');
	}
	
	@Test
	public void testgetCharMurIndestructible() {
		assertEquals(p.getChar(0,0), 'I');
	}
	
	@Test
	public void testgetCharMurDestructible() {
		assertEquals(p.getChar(1,4), 'D');
	}
	
	@Test
	public void testgetCharCaseVide() {
		assertEquals(p.getChar(1,2), 'V');
	}
}
