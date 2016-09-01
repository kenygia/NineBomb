import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurTest {

	Moteur moteur = new Moteur();
	
	@Test
	public void testFinDePartieVrai(){
		moteur.nbMorts=1;
		assertTrue(moteur.finDePartie());
	}
	
	@Test
	public void testFinDePartieFaux(){
		moteur.nbMorts=1;
		assertTrue(moteur.finDePartie());
	}

}
