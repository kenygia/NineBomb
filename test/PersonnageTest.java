import static org.junit.Assert.*;

import org.junit.Test;

public class PersonnageTest {
	
	Personnage perso= new Personnage();
	int[] coo = new int[]{1,2};
	
	@Test
	public void testSetCoords(){
		perso.setCoords(coo);
		assertEquals(perso.getCoords(), coo);
	}
	
	@Test
	public void testGetCoords(){
		perso.setCoords(coo);
		assertEquals(coo, perso.getCoords());
	}
}
