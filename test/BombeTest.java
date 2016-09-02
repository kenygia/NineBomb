import static org.junit.Assert.*;

import org.junit.Test;

public class BombeTest {
	
	int[] tab = new int[]{1,2,3};
	Bombe b = new Bombe(tab);

	@Test
	public void testGetSetCoords() {
		b.setCoords(tab);
		assertEquals(b.getCoords(), tab);
		
	}
	
	@Test
	public void testSetName(){
		b.setName('N');
		assertEquals('N', b.getName());
	}
	
	@Test
	public void testGetName(){
		assertEquals('B',b.getName());
	}
	
	@Test
	public void testSetPortee(){
		b.setPortee(3);
		assertEquals(3,b.getPortee());
	}
	
	@Test
	public void testGetPortee(){
		assertEquals(1,b.getPortee());
	}
	
	@Test
	public void testSetCounter(){
		b.setCounter(5);
		assertEquals(5,b.getCounter());
	}
	
	@Test
	public void testGetCounter(){
		assertEquals(3,b.getCounter());
	}
	
	@Test
	public void testDecounter(){
		b.setCounter(2);
		b.decounter();
		assertEquals(1,b.getCounter());
	}

}
