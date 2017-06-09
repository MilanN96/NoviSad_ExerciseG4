import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() throws BowlingException{
		//fail("Not yet implemented");
		Frame fr = new Frame(1,4);
		assertEquals(5,fr.score());	
	}
	@Test 
	public void testSpare() throws BowlingException {
		Frame fr = new Frame(6,4);
		assertEquals(true,fr.isSpare());
	}
	@Test 
	public void testSpare2() throws BowlingException {
		Frame fr = new Frame(6,3);
		assertEquals(false,fr.isSpare());
	}
	@Test 
	public void testStrike() throws BowlingException {
		Frame fr = new Frame(10,0);
		assertEquals(true,fr.isStrike());
	}
	@Test 
	public void testScore() throws BowlingException {
		BowlingGame bg = new BowlingGame();
		Frame fr = new Frame(5,3);
		assertEquals(8,bg.score());
		
		
	}
	

	
	
	

}
