import static org.junit.Assert.*;
import org.junit.Test;
import sort.Item;

public class CaseTest {
	
	Personnage perso = new Personnage();
	int[] tab = new int[]{};
	Bombe bombe = new Bombe(tab);
	Item item;
	char laCase;
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

}