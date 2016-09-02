import static org.junit.Assert.*;
import org.junit.Test;
import sort.*;

public class CaseTest {
	
	Personnage perso = new Personnage();
	int[] tab = new int[]{1,2,3};
	Bombe bombe = new Bombe(tab);
	Item item;
	char laCase = 'V';
	Case c = new Case(perso,bombe,laCase,item);
	
	@Test
	public void testGetSetPerso() {
		c.setPerso(perso);
		assertEquals(c.getPerso(), perso);
	}
	
	@Test
	public void testGetSetBombe() {
		c.setBombe(bombe);
		assertEquals(c.getBombe(), bombe);
	}
	
	@Test
	public void testGetSetItem(){
		c.setItem(item);
		assertEquals(c.getItem(), item);
	}
	
	@Test
	public void testGetLaCase(){
		assertEquals(c.getLaCase(), 'V');
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
		assertEquals('\u25B4',c1.Priorite());
	}
	
	@Test
	public void testPrioritePlayer2(){
		Personnage perso2 = new Personnage("Player 2");
		Case c2 = new Case(perso2,bombe,laCase,null);
		assertEquals('\u25B5',c2.Priorite());
	}
	
	@Test
	public void testPrioriteB(){
		Personnage perso3 = null;
		Case c3= new Case(perso3,bombe,laCase,item);
		assertEquals('\u03CC',c3.Priorite());
	}
	
	@Test
	public void testPrioriteBombDown(){
		Item i4 = new BombDown();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('e',c4.Priorite());
	}
	
	@Test
	public void testPrioriteBombUp(){
		Item i4 = new BombUp();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('E',c4.Priorite());
	}
	
	@Test
	public void testPrioriteFireDown(){
		Item i4 = new FireDown();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('f',c4.Priorite());
	}
	
	@Test
	public void testPrioriteFireUp(){
		Item i4 = new FireUp();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('F',c4.Priorite());
	}
	
	@Test
	public void testPrioriteSkull(){
		Item i4 = new Skull();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('D',c4.Priorite());
	}
	
	@Test
	public void testPrioriteSpeedDown(){
		Item i4 = new SpeedDown();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('s',c4.Priorite());
	}
	
	@Test
	public void testPrioriteVide(){
		Item i4 = new SpeedUp();
		Case c4 = new Case(null,null,laCase,i4);
		assertEquals('S',c4.Priorite());
	}
	
	@Test
	public void testPriorite1(){
		char laCase2 = 'I';
		Case c2 = new Case(perso,bombe,laCase2,item);
		assertEquals('\u25A0', c2.Priorite());
	}
	
	@Test
	public void testPriorite2(){
		char laCase2 = 'D';
		Case c2 = new Case(perso,bombe,laCase2,item);
		assertEquals('\u25A1', c2.Priorite());
	}
}