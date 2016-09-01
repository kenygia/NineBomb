import static org.junit.Assert.*;

import org.junit.Test;

public class PersonnageTest {
	
	Personnage perso= new Personnage();
	int[] coo = new int[]{1,2};
	
	
	@Test
	public void testGetToucheBombe(){
		assertEquals(perso.touche[perso.touche.length-1],perso.getToucheBombe());
	}
	
	@Test
	public void testSetCoords(){
		perso.setCoords(coo);
		assertEquals(perso.coords, coo);
	}
	
	@Test
	public void testGetCoords(){
		assertEquals(perso.coords, perso.getCoords());
	}
	
	@Test
	public void testGetDeplacementHaut(){
		assertEquals(perso.getDeplacement('z'), perso.deplacement[0]);
	}
	
	@Test
	public void testGetDeplacementGauche(){
		assertEquals(perso.getDeplacement('q'), perso.deplacement[1]);
	}
	
	@Test
	public void testGetDeplacementBas(){
		assertEquals(perso.getDeplacement('s'), perso.deplacement[2]);
	}
	
	@Test
	public void testGetDeplacementDroite(){
		assertEquals(perso.getDeplacement('d'), perso.deplacement[3]);
	}

}
