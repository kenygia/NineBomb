import static org.junit.Assert.*;

import org.junit.Test;

public class PersonnageTest {
	
	Personnage perso= new Personnage();
	int[] coo = new int[]{1,2};
	
	@Test
	public void testSetCoords(){
		perso.setCoords(coo);
		assertEquals(perso.coords, coo);
	}
	
	@Test
	public void testGetCoords(){
		assertEquals(perso.coords, perso.getCoords());
	}
}
