import static org.junit.Assert.*;
import org.junit.Test;
import sort.Item;

public class CaseTest {
	
	Personnage perso = new Personnage();
	int[] tab = new int[]{};
	Bombe bombe = new Bombe(tab);
	Item item;
	char laCase = 'V';
	Case c = new Case(perso,bombe,laCase,item);

	@Test
	public void testGetPerso() {
		assertEquals(c.getPerso(), perso);
	}
	
	@Test
	public void testSetPerso() {
		c.setPerso(perso);
		assertEquals(c.getPerso(), perso);
	}
	
	@Test
	public void testGetBombe() {
		assertEquals(c.getBombe(), bombe);
	}
	
	@Test
	public void testSetBombe() {
		c.setBombe(bombe);
		assertEquals(c.getBombe(), bombe);
	}
	
	@Test
	public void testGetItem(){
		assertEquals(c.getItem(), item);
	}
	
	@Test
	public void testSetItem(){
		c.setItem(item);
		assertEquals(c.getItem(), item);
	}
	
	@Test
	public void testGetLaCase(){
		assertEquals(c.getLaCase(), laCase);
	}
	
	@Test
	public void testSetLaCase(){
		c.setLaCase(laCase);
		assertEquals(c.getLaCase(), laCase);
	}
	
	@Test
	public void testPrioritePlayer1(){
		Personnage perso1 = new Personnage("Player 1");
		Case c1 = new Case(perso1,bombe,laCase,item);
		assertEquals('1',c1.Priorite());
	}
	
	@Test
	public void testPrioritePlayer2(){
		Personnage perso2 = new Personnage("Player 2");
		Case c2 = new Case(perso2,bombe,laCase,null);
		assertEquals('2',c2.Priorite());
	}
	
	@Test
	public void testPrioriteB(){
		Personnage perso3 = new Personnage("P");
		Case c3= new Case(perso3,bombe,laCase,null);
		assertEquals('B',c3.Priorite());
	}
	
/*	@Test
	public void testPrioriteBombDown(){
		Personnage perso4 = new Personnage("P");
		Case c4 = new Case(perso4,null,laCase,null);
		assertEquals('e',c4.Priorite());
	}*/
	
	//Tests bonus et malus a faire
}