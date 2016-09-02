import static org.junit.Assert.*;

import org.junit.Test;

public class PersonnageTest {
	
	Personnage perso= new Personnage();
	int[] coo = new int[]{1,2};
	
	@Test
	public void testSetGetCoords(){
		perso.setCoords(coo);
		assertEquals(perso.getCoords(), coo);
	}
	
	@Test
	public void testEstMort(){
		assertFalse(perso.estMort());
	}
	
	@Test
	public void testFaireMourir(){
		perso.faireMourir();
		assertTrue(perso.estMort());
	}
	
	@Test
	public void testSetGetNom(){
		perso.setNom("nom");
		assertEquals(perso.getNom(), "nom");
	}
	
	@Test
	public void testSetNbAction(){
		perso.setNbAction(0);
		assertEquals(perso.getNbAction(), 0);
	}
	
	@Test
	public void testGetNbActions(){
		assertEquals(perso.getNbAction(), 2);
	}
	
	@Test
	public void testEstBotAutoBase(){
		assertFalse(perso.estBotAuto());
	}
	
	@Test
	public void testEstSetBotAutoTRUE(){
		perso.setBotAuto(true);
		assertTrue(perso.estBotAuto());
	}
	
	@Test
	public void testEstSetBotAutoFALSE(){
		perso.setBotAuto(false);
		assertFalse(perso.estBotAuto());
	}
	
	 
}
